package Entidades;

public class Estacao {
    private String nome;
    private String linha;
    private Localizacao localizacao;

    //Métodos
    public String getInformacoes() {
        return "Estação: " + nome + " - Linha: " + linha;
    }

    public String getLocalizacao() {
        return localizacao.getCoordenadas();
    }

    //Construtor vazio
    public Estacao() {
    }

    //Construtor completo
    public Estacao(String nome, String linha, Localizacao localizacao) {
        this.nome = nome;
        this.linha = linha;
        this.localizacao = localizacao;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLinha() {
        return linha;
    }
    public void setLinha(String linha) {
        this.linha = linha;
    }
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}