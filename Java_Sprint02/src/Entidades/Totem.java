package Entidades;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Totem {
    private int idTotem;
    private Estacao localAtual;
    private ChatBot chatbot;
    private List<PontoInteresse> pontosTuristicos;

    //Métodos
    public Rota mostrarRota(Estacao destino) {
        return new Rota(localAtual, destino, 10, 2);
    }

    public String mostrarLocalAtual() {
        return localAtual.getInformacoes();
    }

    public List<String> pontosTuristicosProximos() {
        // Usando Stream para listar pontos turísticos
        return pontosTuristicos.stream()
                .map(PontoInteresse::getInformacoes)
                .collect(Collectors.toList());
    }

    public void iniciarChatbot() {
        System.out.println("Chatbot iniciado: " + chatbot.getNome());
    }

    //Construtor vazio
    public Totem() {
    }

    //Construtor completo
    public Totem(int idTotem, Estacao localAtual, ChatBot chatbot, List<PontoInteresse> pontosTuristicos) {
        this.idTotem = idTotem;
        this.localAtual = localAtual;
        this.chatbot = chatbot;
        this.pontosTuristicos = pontosTuristicos;
    }

    //Getters e Setters
    public int getIdTotem() {
        return idTotem;
    }
    public void setIdTotem(int idTotem) {
        this.idTotem = idTotem;
    }
    public Estacao getLocalAtual() {
        return localAtual;
    }
    public void setLocalAtual(Estacao localAtual) {
        this.localAtual = localAtual;
    }
    public ChatBot getChatbot() {
        return chatbot;
    }
    public void setChatbot(ChatBot chatbot) {
        this.chatbot = chatbot;
    }
    public List<PontoInteresse> getPontosTuristicos() {
        return pontosTuristicos;
    }
    public void setPontosTuristicos(List<PontoInteresse> pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }
}
