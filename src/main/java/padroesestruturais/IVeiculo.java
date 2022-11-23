package padroesestruturais;

import java.util.List;

public interface IVeiculo {

    List<String> obterDadosVeiculos();
    List<Float> obterPrecos(Vendedor vendendor);
}
