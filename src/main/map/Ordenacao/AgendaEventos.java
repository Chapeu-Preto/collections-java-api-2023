package main.map.Ordenacao;

import main.map.AgendaContatos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento (LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda () {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
    }

    public void  obterProximoEvento () {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main (String [] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();
        System.out.println(agendaEventos.eventosMap);

        agendaEventos.adicionarEvento(LocalDate.of(1993,02,22), "Nascimento", "Meu ano de nascimento");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 02, 22), "Aniversário", "Dia 22 de Fevereiro completo 32 Anos");
        agendaEventos.adicionarEvento(LocalDate.of(2019,03,31), "Nascimento de Benjamim", "O dia que meu lindo nasceu");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 03, 31), "Aniversario Benjamim", "Meu lindo faz 6 anos");

        System.out.println(agendaEventos.eventosMap);

        agendaEventos.obterProximoEvento();
    }
}
