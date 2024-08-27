package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //Atributo

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa () {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade () {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura () {
        List<Pessoa> pessoasPorAltura  = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main (String [] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Higor", 31,1.69);
        ordenacaoPessoa.adicionarPessoa("Benjamim", 5, 1.10);
        ordenacaoPessoa.adicionarPessoa("Aila", 1,0.50);
        ordenacaoPessoa.adicionarPessoa("Renata", 49, 1.62);
        ordenacaoPessoa.adicionarPessoa("Pretta", 11, 1.05);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
