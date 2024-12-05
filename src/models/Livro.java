package models;

import exceptions.AutorNullException;

public abstract class Livro implements Produto{
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    public Livro(Autor autor) {
        if(autor==null){
            throw new AutorNullException("O Autor do livro não pode ser nulo!");
        }else{
            //this();
            this.isbn="000-00-00000-00-1";
            this.autor = autor;
        }

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

    public int compareTo(Produto outroProduto){
        // return (x < y) ? -1 : ((x == y) ? 0 : 1);
        return (this.getValor()<outroProduto.getValor())? -1 : ((this.getValor()==outroProduto.getValor())?0:1);
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
