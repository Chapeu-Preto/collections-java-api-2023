package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;

    public AgendaContatos () {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos (String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos () {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main (String [] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Abaixo uso a classe System para imprimir a lista antes de ser adicionado os contatos.
        //Abaixo está sendo impresso uma lista inicial onde não ira retorna nenhum contato.
        System.out.println(agendaContatos.contatoSet);

        //Aqui estou adicionando alguns contatos para ser impresso.
        agendaContatos.adicionarContatos("Higor", 998335417);
        agendaContatos.adicionarContatos("Benjamim", 998335418);
        agendaContatos.adicionarContatos("higor", 12345678);
        agendaContatos.adicionarContatos("Jaqueline", 99848352);
        agendaContatos.adicionarContatos("Benjamim", 12345678);
        agendaContatos.adicionarContatos("Renata", 98211387);
        agendaContatos.adicionarContatos("Paula", 996475497);
        agendaContatos.adicionarContatos("Higor Bezerra", 998335417);

        //Aqui mais uma vez utilizamos a classe System para imprimir a lista só que dessa vez com alguns contatos inserido.
        System.out.println(agendaContatos.contatoSet);

        //Aqui estou exibindo os contatos chamando direto pelo metodo.
        agendaContatos.exibirContatos();

        //Aqui estou utilizando a classe System para pesquisar o contato pelo nome e assim imprimir apenas o nome selecionado.
        System.out.println(agendaContatos.pesquisarPorNome("Benjamim"));

        //Aqui estou alterando o número do contato passando o Nome do contato que quero mudar e informando o novo número.
        System.out.println(agendaContatos.atualizarNumeroContato("higor", 87654321));

        //Aqui mais uma vez estou imprimindo os contatos para ver se o contato que foi solicitado a alteração do número foi realizada.
        System.out.println(agendaContatos.contatoSet);
    }
}
