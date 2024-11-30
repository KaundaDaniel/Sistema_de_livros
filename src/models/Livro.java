package models;

public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;
   public  void mostraDetalhes() {
        System.out.println("Mostra Detalhes");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Nome do Autor: " + autor.nome);
        System.out.println("Email do Autor: " + autor.email);
        System.out.println("BI do Autor: " + autor.bi);
        System.out.println("--------");
    }
}
