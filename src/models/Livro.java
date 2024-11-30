package models;

public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public String nomeDoAutor;
    public String emailDoAutor;
    public String biAutor;

   public  void mostraDetalhes() {
        System.out.println("Mostra Detalhes");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Nome do Autor: " + nomeDoAutor);
        System.out.println("Email do Autor: " + emailDoAutor);
        System.out.println("BI do Autor: " + biAutor);
        System.out.println("--------");
    }
}
