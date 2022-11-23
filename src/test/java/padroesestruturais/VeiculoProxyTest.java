package padroesestruturais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addVeiculo(new Veiculo(1, "Civic", "Honda", "2022", 150000.0f, 140000.0f));
        BD.addVeiculo(new Veiculo(2, "Corolla", "Toyota","2023", 170000.0f, 150000.0f));
    }

    @Test
    void deveRetornarDadosDoVeículo() {
        VeiculoProxy aluno = new VeiculoProxy(1);

        assertEquals(Arrays.asList("Civic","Honda", "2022"), aluno.obterDadosVeiculos());
    }

    @Test
    void deveRetonarPrecoDosVeiculos() {
        Vendedor vendedor = new Vendedor("Morata", true);
        VeiculoProxy aluno = new VeiculoProxy(2);

        assertEquals(Arrays.asList(170000.0f, 150000.0f), aluno.obterPrecos(vendedor));
    }

    @Test
    void deveRetonarExcecaoVendedoraoAutorizadoConsultarVeiculo() {
        try {
            Vendedor vendedor = new Vendedor("Laporte", false);
            VeiculoProxy veiculo = new VeiculoProxy(2);

            veiculo.obterPrecos(vendedor);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Vendedor não autorizado", e.getMessage());
        }
    }

}