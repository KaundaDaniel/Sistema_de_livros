import models.Autor;
import models.Livro;
import models.LivroFisico;
import models.MiniLivro;

public class RegrasDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Jorge Jesus");
        LivroFisico livro = new LivroFisico(autor);
        livro.setValor(39.90);
        livro.setNome("Livro Físico");
        livro.setDescricao("Fisica Quantity");
        livro.aplicarDesconto(30);

        Livro miniLivro= new MiniLivro(autor);
        miniLivro.setValor(19.90);
        miniLivro.setNome("Mini Livro");
        miniLivro.setDescricao("Livro Miniatura");
        miniLivro.aplicarDesconto(20);


            }
}
