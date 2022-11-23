package padroesestruturais;

import java.util.List;

public class VeiculoProxy implements IVeiculo{

    private Veiculo veiculo;

    private Integer cadastro;

    public VeiculoProxy (Integer cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public List<String> obterDadosVeiculos() {
        if (this.veiculo == null) {
            this.veiculo = new Veiculo(this.cadastro);
        }
        return this.veiculo.obterDadosVeiculos();
    }

    @Override
    public List<Float> obterPrecos(Vendedor vendendor) {
        if (!vendendor.isAdministrador()) {
            throw new IllegalArgumentException("Vendedor não autorizado");
        }
        if (this.veiculo == null) {
            this.veiculo = new Veiculo(this.cadastro);
        }
        return this.veiculo.obterPrecos(vendendor);
    }

}
