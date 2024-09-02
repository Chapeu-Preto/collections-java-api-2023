package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //Atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos () {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionaProduto (String nome, int quantidade, long codigo, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos () {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p: estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro () {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato () {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }
    //Metodo que retorna o produto com o maior valor em estoque com base na quatidade.
    //O metodo calcula o valor e a quantidade se o valor for maior ele calcula a quantidade e se atingir o valor maior
    // mesmo que sua quantidade seja poca mas seu valor seja o maior o metodo retornará esse produto.
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = 0.0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                double valorTotal = p.getQuantidade() * p.getPreco();
                if (valorTotal > maiorValorTotal) {
                    maiorValorTotal = valorTotal;
                    produtoMaiorValorTotal = p;
                }
            }
        }
        return produtoMaiorValorTotal;
    }

    //Metodo main usado para iniciar e/ou testar os metodos
    public static void main (String [] args) {
        //Abaixo está sendo instanciado um novo objeto Estoque Produtos
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        //Aqui vamos imprimir a lista de Produtos que temos na Lista e essa retornara 0 pois está sendo iniciada antes
        //de ter produtos adicionados.
        System.out.println(estoqueProdutos.estoqueProdutosMap);

        //Aqui estamos utilizando o metodo criado AdicionarProduto para adicionar alguns produtos a lista.
        estoqueProdutos.adicionaProduto("Pata de Dentes", 2, 100010, 1.25);
        estoqueProdutos.adicionaProduto("Sabonete", 10, 100011, 0.99);
        estoqueProdutos.adicionaProduto("Margarina", 1, 100012, 1.99);
        estoqueProdutos.adicionaProduto("Queijo Mussarela", 1, 100013, 3.98);
        estoqueProdutos.adicionaProduto("Fiambre", 1, 100014, 4.69);
        estoqueProdutos.adicionaProduto("Água Mineral 500ml", 1, 100015, 0.98);

        //Aqui Estou imprimindo os produtos após adicionados a lista, que agora ira retornar 8 prdutos.
        System.out.println(estoqueProdutos.estoqueProdutosMap);

        //Aqui estou chamando o metodo e imprimindo o valor total dos produtos em estoque.
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        //Aqui estou chamando o metodo e imprimindo o produto mais barato.
        System.out.println("Produto Mais Caro: " + estoqueProdutos.obterProdutoMaisCaro());

        //Aqui estou chamando o metodo e imprimindo para obter o produto mais barato.
        System.out.println("Produto Mais Barato: " + estoqueProdutos.obterProdutoMaisBarato());

        //Aqui estou chamando e imprimindo o produto de maior valor em estoque
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

}
