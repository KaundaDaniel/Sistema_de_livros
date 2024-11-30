import models.Autor;
import models.Livro;

public class Main {
    public static void main(String[] args) {
        //Criação de entidade Autor
        Autor autor = new Autor();
        autor.nome = "Kaunda da Gama";
        autor.email = "kaundagama@gmail.com";
        autor.bi = "00123456789";

        //Criação da entidade livro
        Livro livro= new Livro();
        livro.nome = "Livro de Java";
        livro.descricao = "Novos recursos de Java";
        livro.isbn="978-85-66250-22-0";
        livro.valor = 49.99;
        livro.autor = autor; // Atribuindo o autor ao livro.
        livro.aplicarDesconto(4.99);

        Autor outroAutor = new Autor();
        outroAutor.nome = "Jonathan Mandombe";
        outroAutor.email = "jonathanmandob@gmail.com";
        outroAutor.bi = "00123456788";

        //Criando outro livro com outro autor.
        Livro outroLivro = new Livro();
        outroLivro.nome = "Livro de Python";
        outroLivro.descricao = "Novos recursos de Python";
        outroLivro.isbn="978-85-66250-11-3";
        outroLivro.valor = 59.99;
        outroLivro.autor = outroAutor; // Atribuindo o outro autor ao livro.




        livro.mostraDetalhes();// Método que exibe os detalhes do livro.
        outroLivro.mostraDetalhes();// Método que exibe os detalhes do outro livro.

    }
}