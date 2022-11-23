package padroesestruturais;

import java.util.Arrays;
import java.util.List;

public class Veiculo implements IVeiculo{



    private Integer cadastro;
    private String modelo;
    private String fabricante;
    private String ano;
    private Float preco20;
    private Float preco30;

    public Veiculo(int matricula) {
        this.cadastro = matricula;
        Veiculo objeto = BD.getVeiculo(matricula);
        this.modelo = objeto.modelo;
        this.fabricante = objeto.fabricante;
        this.ano = objeto.ano;
        this.preco20 = objeto.preco20;
        this.preco30 = objeto.preco30;
    }

    public Veiculo(Integer cadastro, String modelo, String fabricante, String ano, Float preco20, Float preco30) {
        this.cadastro = cadastro;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.preco20 = preco20;
        this.preco30 = preco30;
    }

    public Integer getCadastro() {
        return cadastro;
    }
    @Override
    public List<String> obterDadosVeiculos() {
        return Arrays.asList(this.modelo,this.fabricante,this.ano);
    }

    @Override
    public List<Float> obterPrecos(Vendedor vendendor) {
        return Arrays.asList( this.preco20,this.preco30);
    }
}
