import models.Autor;
import models.Livro;

public class Main {
    public static void main(String[] args) {
        //Criação de entidade Autor
        Autor autor = new Autor();
        autor.setNome("Kaunda da Gama");
        autor.setEmail("kaundagama@gmail.com");
        autor.setBi("00123456789");

        //Criação da entidade livro
        Livro livro= new Livro(autor);
        livro.setNome("Livro de Java") ;
        livro.setDescricao("Novos recursos de Java");
        livro.setIsbn("978-85-66250-22-0");
        livro.setValor(49.99) ;
        //livro.autor = autor; // Atribuindo o autor ao livro.
        livro.aplicarDesconto(4.99);

        Autor outroAutor = new Autor();
        outroAutor.setNome("Jonathan Mandombe");
        outroAutor.setEmail("jonathanmandob@gmail.com");
        outroAutor.setBi("00123456788");

        //Criando outro livro com outro autor.
        Livro outroLivro = new Livro(outroAutor);
        outroLivro.setNome ("Livro de Python");
        outroLivro.setDescricao("Novos recursos de Python");
        outroLivro.setIsbn("978-85-66250-11-3");
        outroLivro.setValor(59.99);
         // Atribuindo o outro autor ao livro.




        livro.mostraDetalhes();// Método que exibe os detalhes do livro.
        outroLivro.mostraDetalhes();// Método que exibe os detalhes do outro livro.

    }
}