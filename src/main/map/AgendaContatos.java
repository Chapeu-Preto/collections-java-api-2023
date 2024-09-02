package main.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContatos (String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato (String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContato () {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome (String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
           numeroPorNome = agendaContatosMap.get(nome);
       }
        return numeroPorNome;
    }

    public static void main (String [] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println(agendaContatos.agendaContatosMap);

        agendaContatos.adicionarContatos("Higor", 998335417);
        agendaContatos.adicionarContatos("Benjamim", 998335418);
        agendaContatos.adicionarContatos("Paula", 998465229);
        agendaContatos.adicionarContatos("Jaqueline", 997354618);
        agendaContatos.adicionarContatos("Renata", 987654321);
        agendaContatos.adicionarContatos("Marcia", 1236932169);
        agendaContatos.adicionarContatos("Paula", 12345678);

        System.out.println(agendaContatos.agendaContatosMap);

        agendaContatos.removerContato("Marcia");
        System.out.println(agendaContatos.agendaContatosMap);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Renata"));
    }
}
