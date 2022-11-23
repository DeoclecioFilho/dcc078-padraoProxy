package padroesestruturais;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Veiculo> veiculos = new HashMap<>();

    public static Veiculo getVeiculo(Integer cadastro) {
        return veiculos.get(cadastro);
    }

    public static void addVeiculo(Veiculo veiculo) {
        veiculos.put(veiculo.getCadastro(), veiculo);
    }
}
