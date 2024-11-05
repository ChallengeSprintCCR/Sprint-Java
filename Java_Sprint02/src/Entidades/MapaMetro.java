package Entidades;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MapaMetro {
    private List<Estacao> listaEstacoes;
    private Map<Estacao, List<Estacao>> conexoes;

    //Métodos
    public void carregarMapa() {
        System.out.println("Mapa carregado com sucesso.");
    }

    public Optional<Estacao> buscarEstacao(String nome) {
        return listaEstacoes.stream()
                .filter(estacao -> estacao.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }

    public void exibirRota(Rota rota) {
        System.out.println("Exibindo rota de: " + rota.getEstacaoInicial().getNome() + " para " + rota.getEstacaoFinal().getNome());
    }

    //Construtor vazio
    public MapaMetro() {
    }

    //Construtor completo
    public MapaMetro(List<Estacao> listaEstacoes, Map<Estacao, List<Estacao>> conexoes) {
        this.listaEstacoes = listaEstacoes;
        this.conexoes = conexoes;
    }

    //Getters e Setters
    public List<Estacao> getListaEstacoes() {
        return listaEstacoes;
    }
    public void setListaEstacoes(List<Estacao> listaEstacoes) {
        this.listaEstacoes = listaEstacoes;
    }
    public Map<Estacao, List<Estacao>> getConexoes() {
        return conexoes;
    }
    public void setConexoes(Map<Estacao, List<Estacao>> conexoes) {
        this.conexoes = conexoes;
    }
}
