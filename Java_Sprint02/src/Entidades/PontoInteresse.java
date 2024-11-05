package Entidades;

public class PontoInteresse {
    private String nome;
    private String descricao;
    private double distancia;
    private Localizacao localizacao;

    //Métodos
    public String getInformacoes() {
        return "Ponto de Interesse: " + nome + " - " + descricao + " a " + distancia + " km";
    }

    //Construtor vazio
    public PontoInteresse() {
    }

    //Construtor completo
    public PontoInteresse(String nome, String descricao, double distancia, Localizacao localizacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.distancia = distancia;
        this.localizacao = localizacao;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public Localizacao getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}
