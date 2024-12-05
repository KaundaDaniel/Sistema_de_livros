import models.*;

import java.util.List;

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
        List<Produto>prods=carrinhoCompras.getProds();

        carrinhoCompras.adiciona(fisico);
        carrinhoCompras.adiciona(ebook);

        for(Produto produto : prods){
            System.out.println(""+produto.getValor());
        }

    }
}
