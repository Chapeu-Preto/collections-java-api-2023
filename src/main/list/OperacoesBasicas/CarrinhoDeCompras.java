package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem( String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista está vazia !");
        }
    }

    public double CalcularPrecoValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        //criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Açucar", 2.50, 3);
        carrinhoDeCompras.adicionarItem("café", 5.50,4);
        carrinhoDeCompras.adicionarItem("leite", 4.80, 5);
        carrinhoDeCompras.adicionarItem("Ovo", 2.80, 6);

        //Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        //Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Açucar");

        //Exibir itens carrinho
        carrinhoDeCompras.exibirItens();

        //Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é= " + carrinhoDeCompras.CalcularPrecoValorTotal());
    }
}
