package models;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    public Livro(Autor autor) {
        this();
        this.autor = autor;
    }
    public Livro() {
        this.isbn="000-00-00000-00-0";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }
/*
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    */


    public void aplicarDesconto(double percentagem) {
        this.valor -= valor * (percentagem/100);
    }
    public boolean temAutor(){
        return this.autor!= null;
    }

    public  void mostraDetalhes() {
        System.out.println("Mostra Detalhes");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if(temAutor()){
            autor.mostraDetalhes();
        }

    }
}
