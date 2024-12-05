import models.Autor;
import models.Ebook;
import models.LivroFisico;
import models.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoComJava {
    public static void main(String[] args) {
        Autor autor=new Autor();
        autor.setNome("Kaunda da Gama");
        autor.setEmail("kaundagama@gmail.com");
        autor.setBi("00123456789");
        LivroFisico livroFisico=new LivroFisico(autor);
        livroFisico.setNome("Livro Físico");
        livroFisico.setValor(799.90);

        Ebook ebook=new Ebook(autor);
        ebook.setNome("Livro Ebook");
        ebook.setValor(249.90);
        ebook.setWaterMark("Imagem da capa");

        List<Produto> produtos= Arrays.asList(ebook, livroFisico);
        Collections.sort(produtos);

        for(Produto produto : produtos){
            System.out.println(produto.getValor());
        }



    }
}
