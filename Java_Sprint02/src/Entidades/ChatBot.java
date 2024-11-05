package Entidades;

import java.util.List;
import java.util.Optional;

public class ChatBot {
    private String nome;
    private List<String> listaPerguntasFrequentes;

    //Métodos
    public String respostaPergunta(String pergunta) {
        Optional<String> resposta = listaPerguntasFrequentes.stream()
                .filter(p -> p.equalsIgnoreCase(pergunta))
                .findFirst();
        return resposta.orElse("Pergunta não encontrada");
    }

    public List<String> getPerguntasFrequentes() {
        return listaPerguntasFrequentes;
    }

    //Construtor vazio
    public ChatBot() {
    }

    //Construtor completo
    public ChatBot(String nome, List<String> listaPerguntasFrequentes) {
        this.nome = nome;
        this.listaPerguntasFrequentes = listaPerguntasFrequentes;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getListaPerguntasFrequentes() {
        return listaPerguntasFrequentes;
    }
    public void setListaPerguntasFrequentes(List<String> listaPerguntasFrequentes) {
        this.listaPerguntasFrequentes = listaPerguntasFrequentes;
    }
}
