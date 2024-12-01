import models.Autor;
import models.CarrinhoCompras;
import models.Ebook;
import models.LivroFisico;

public class RegistroVendas {
    public static void main(String[] args) {
        Autor autor= new Autor();
        autor.setNome("Kaunda da Gama");
        LivroFisico fisico= new LivroFisico(autor);
        fisico.setNome("Livro Físico");

        fisico.setValor(59.90);
        Ebook ebook= new Ebook(autor);
        ebook.setNome("Livro Fisico");
        ebook.setValor(29.90);

        CarrinhoCompras carrinhoCompras= new CarrinhoCompras();
        carrinhoCompras.adiciona(fisico);
        carrinhoCompras.adiciona(ebook);

        System.out.println("O total de livors  comprados é: "+ carrinhoCompras.getTotal());
    }
}
