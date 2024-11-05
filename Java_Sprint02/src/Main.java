import Entidades.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1. Criando Localizacao
        Localizacao localizacaoEstacaoSe = new Localizacao(-23.5505, -46.6333); //Estação Sé
        Localizacao localizacaoEstacaoConsolacao = new Localizacao(-23.5566, -46.6629); //Estação Consolação
        Localizacao localizacaoMasp = new Localizacao(-23.561414, -46.655881); //MASP
        Localizacao localizacaoParqueIbirapuera = new Localizacao(-23.587416, -46.657634); //Parque Ibirapuera

        //2. Criando Estacao
        Estacao estacaoSe = new Estacao("Sé", "Linha Vermelha", localizacaoEstacaoSe);
        Estacao estacaoConsolacao = new Estacao("Consolação", "Linha Verde", localizacaoEstacaoConsolacao);

        //3. Criando Ponto de Interesse
        PontoInteresse masp = new PontoInteresse("Museu de Arte de São Paulo (MASP)", "Museu icônico com coleção de arte famosa", 0.8, localizacaoMasp);
        PontoInteresse parqueIbirapuera = new PontoInteresse("Parque Ibirapuera", "Parque popular com áreas verdes e museus", 3.0, localizacaoParqueIbirapuera);

        //4. Testando Ponto de Interesse
        System.out.println("Informações sobre os pontos de interesse:");
        System.out.println(masp.getInformacoes());
        System.out.println(parqueIbirapuera.getInformacoes());

        //5. Criando uma lista de estações para o MapaMetro
        List<Estacao> listaEstacoes = Arrays.asList(estacaoSe, estacaoConsolacao);

        //6. Criando mapa de conexões para o MapaMetro
        Map<Estacao, List<Estacao>> conexoes = new HashMap<>();
        conexoes.put(estacaoSe, Arrays.asList(estacaoConsolacao));  //Ligando estação Sé à estação Consolação
        conexoes.put(estacaoConsolacao, Arrays.asList(estacaoSe));  //Ligando estação Consolação à estação Sé

        //7. Criando MapaMetro
        MapaMetro mapaMetro = new MapaMetro(listaEstacoes, conexoes);
        mapaMetro.carregarMapa();

        //8. Testando busca de estação no MapaMetro
        Optional<Estacao> estacaoEncontrada = mapaMetro.buscarEstacao("Sé");
        estacaoEncontrada.ifPresent(estacao -> System.out.println("Estação encontrada: " + estacao.getInformacoes()));

        //9. Criando uma Rota e exibindo informações
        Rota rota = new Rota(estacaoSe, estacaoConsolacao, 5, 1);
        System.out.println("Duração da rota: " + rota.getDuracao() + " minutos");

        //10. Calculando rota
        List<String> nomesEstacoes = rota.calcularRota(listaEstacoes);
        System.out.println("Rota calculada: " + String.join(" -> ", nomesEstacoes));

        //11. Exibindo a rota no MapaMetro
        mapaMetro.exibirRota(rota);

        //12. Criando perguntas frequentes e inicializando ChatBot
        List<String> perguntasFrequentes = Arrays.asList("Qual o horário de funcionamento?", "Onde fica o ponto turístico mais próximo?");
        ChatBot chatbot = new ChatBot("MetroBot", perguntasFrequentes);

        //13. Testando resposta do ChatBot
        System.out.println("Resposta do ChatBot para pergunta 'Qual o horário de funcionamento?': " + chatbot.respostaPergunta("Qual o horário de funcionamento?"));
        System.out.println("Resposta do ChatBot para pergunta 'Onde é o MASP?': " + chatbot.respostaPergunta("Onde é o MASP?"));

        //14. Criando lista de pontos turísticos para o Totem
        List<PontoInteresse> pontosTuristicos = Arrays.asList(masp, parqueIbirapuera);

        //15. CriandoTotem
        Totem totem = new Totem(101, estacaoSe, chatbot, pontosTuristicos);

        //16. Testando funções do Totem
        System.out.println("Totem está localizado em: " + totem.mostrarLocalAtual());
        System.out.println("Pontos turísticos próximos:");
        totem.pontosTuristicosProximos().forEach(System.out::println);

        //17. Iniciando ChatBot no Totem
        totem.iniciarChatbot();

        //18. Mostrando rota para outra estação usando Totem
        Rota rotaParaConsolacao = totem.mostrarRota(estacaoConsolacao);
        System.out.println("Rota do Totem para a estação Consolação: ");
        mapaMetro.exibirRota(rotaParaConsolacao);

        System.out.println("Execução completa!");
    }
}