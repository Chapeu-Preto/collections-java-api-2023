package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto (String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome,codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome () {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco () {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main (String [] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println(cadastroProdutos.produtoSet);

        cadastroProdutos.adicionarProduto("Xuxu", 120040,1.20,1);
        cadastroProdutos.adicionarProduto("Beterraba", 120020, 1.65, 2);
        cadastroProdutos.adicionarProduto("Tomate", 120030, 1.99, 5);
        cadastroProdutos.adicionarProduto("Pepino", 120010, 1.98, 3);
        cadastroProdutos.adicionarProduto("Alho", 120050, 0.98, 4);
        cadastroProdutos.adicionarProduto("Cebola", 120060, 2.48, 6);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
