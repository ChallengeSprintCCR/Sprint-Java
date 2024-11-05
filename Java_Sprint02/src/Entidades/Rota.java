package Entidades;

import java.util.List;
import java.util.stream.Collectors;

public class Rota {
    private Estacao estacaoInicial;
    private Estacao estacaoFinal;
    private int duracao;
    private int numeroConexoes;

    //Métodos
    public List<String> calcularRota(List<Estacao> estacoes) {
        // Usando Stream para mapear a rota (exemplo simplificado)
        return estacoes.stream()
                .map(Estacao::getNome)
                .collect(Collectors.toList());
    }

    public int getDuracao() {
        return duracao;
    }

    //Construtor vazio
    public Rota() {
    }

    //Construtor completo
    public Rota(Estacao estacaoInicial, Estacao estacaoFinal, int duracao, int numeroConexoes) {
        this.estacaoInicial = estacaoInicial;
        this.estacaoFinal = estacaoFinal;
        this.duracao = duracao;
        this.numeroConexoes = numeroConexoes;
    }

    // Getters e Setters
    public Estacao getEstacaoInicial() {
        return estacaoInicial;
    }
    public void setEstacaoInicial(Estacao estacaoInicial) {
        this.estacaoInicial = estacaoInicial;
    }
    public Estacao getEstacaoFinal() {
        return estacaoFinal;
    }
    public void setEstacaoFinal(Estacao estacaoFinal) {
        this.estacaoFinal = estacaoFinal;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getNumeroConexoes() {
        return numeroConexoes;
    }
    public void setNumeroConexoes(int numeroConexoes) {
        this.numeroConexoes = numeroConexoes;
    }
}