package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                };
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main (String [] args) {
        //Criando um novo objeto para catalogo de livros.
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //Adicionando os parametros solicitados: Titulo, Autor(a), e Ano de Publicação.
        catalogoLivros.adicionarLivro("Crisálidas", "Machado de Assis", 1964);
        catalogoLivros.adicionarLivro("Perto do Coração Selvagem", "Clarice Lispector", 1943);
        catalogoLivros.adicionarLivro("Sentimento do Mundo", "Carlos Drummon de Andrade", 1940);
        catalogoLivros.adicionarLivro("O Alquimista", "Paulo Coelho", 1988);
        catalogoLivros.adicionarLivro("Pedras de Sono", "João Cabral de Melo Neto", 1942);
        catalogoLivros.adicionarLivro("O Alto da Compadecida", "Ariano Suassuna", 1955);
        catalogoLivros.adicionarLivro("Minha Guerra Alhiea", "Maria Colasatinti", 2010);
        catalogoLivros.adicionarLivro("Meu Livro de Cordel", "Cora Coralina", 1976);
        catalogoLivros.adicionarLivro("Um Brasil para Brasileiros", "Carolinaa Maia de Jesus", 1982);
        catalogoLivros.adicionarLivro("Os Colegas", "Lygia Bonjunga", 1972);
        //Imprimindo a Lista dos Livros e Autores e Ano em que foi escrito.
        System.out.println(catalogoLivros.livroList);

        //Realizando Pesquisa por Autor.
        System.out.println(catalogoLivros.pesquisaPorAutor("Ariano Suassuna"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(1864,1980));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Os colegas"));

    }
}
