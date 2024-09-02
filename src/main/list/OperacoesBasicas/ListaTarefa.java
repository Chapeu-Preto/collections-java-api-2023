package main.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {

    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        //abaixo estamos imprimindo o número de tarefas existentes na lista.
        //que retorna um array vazio pois não  tem nenhuma tarefa adicionada.
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //abaixo estamos adicionando tarefas.
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        //aqui estamos imprimindo a quantidade de tarefas existentes.
        System.out.println("O número total de eleentos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de eleentos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
        System.out.println();
    }
}
