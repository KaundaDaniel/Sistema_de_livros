package models;

public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;

    public void aplicarDesconto(double percentagem) {
        this.valor -= valor * percentagem;
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
