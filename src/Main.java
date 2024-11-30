import models.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro= new Livro();
        livro.nome = "Livro de Java";
        livro.descricao = "Novos recursos de Java";
        livro.isbn="978-85-66250-22-0";
        livro.valor = 49.99;
        livro.nomeDoAutor = "Kaunda da Gama";
        livro.emailDoAutor = "kaundagama@gmail.com";
        livro.biAutor = "00123456789";
        livro.mostraDetalhes();  // Método que exibe os detalhes do livro.

    }
}