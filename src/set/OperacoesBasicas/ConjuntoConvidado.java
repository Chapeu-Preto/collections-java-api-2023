package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //Atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public ConjuntoConvidado(String nome, int codigoConvidado) {
    }

    //Metodo para adicionar convidado
    public void adicionarConvidado (String nome, int codigoConvidado) {
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    //Metodo para remover o convidado pelo código do convite.
    public void removerConvidadoPorCodigoConvite (int codigoConvidado) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvidado() == codigoConvidado) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //Metodo para contar a quantidade de convidados.
    public int contarConvidado (){
        return convidadoSet.size();
    }

    /*Metodo para Exibir os convidados, OBS: esse metodo não era preciso pois bastava chamar
    da seguinte forma "System.out.println(convidadoSet);" assim pegariamos direto do metodo principal
    private Set<Convidado> convidadoSet;*/
    public void exibirConvidado (){
        System.out.println(convidadoSet);
    }

    //Metodo main para executar o código
    public static void main (String [] args) {
        //Estanciando o código criando um novo objeto.
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existem: " + conjuntoConvidado.contarConvidado() + " convidados na lista.");
        //Chamada do metodo adicionarConvidado para adicionar os convidados inserindo: Nome e Código
        conjuntoConvidado.adicionarConvidado("Fulana", 12345);
        conjuntoConvidado.adicionarConvidado("Higor", 12345678);
        conjuntoConvidado.adicionarConvidado("Benjamim", 1234567);
        conjuntoConvidado.adicionarConvidado("Pretta", 123456);
        conjuntoConvidado.adicionarConvidado("Delta",12345);


        System.out.println("Número de convidados: " + conjuntoConvidado.contarConvidado() + " Foram confirmados.");
        System.out.println(conjuntoConvidado.convidadoSet);

        //Chamada do metodo removerConvidadoPorCodigoConvite para remover convidado
        conjuntoConvidado.removerConvidadoPorCodigoConvite(12345);

        //Usando o metodo System.out para imprimir os convidados.
        System.out.println(conjuntoConvidado.convidadoSet);

        //Usando o metodo System.uot para imprimir a quantidade de convidados na lista.
        System.out.println(conjuntoConvidado.convidadoSet.size());
    }
}
