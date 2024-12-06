import models.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NovidadesDoJava8 {
    public static void main(String[] args) {
        // Novidades do Java 8
        Autor autor = new Autor();
        autor.setNome("JavaFX Developer");
        Livro java = new Ebook(autor);
        java.setNome("JavaFX Developer's Guide");
        java.setValor(45.90);

        Livro ruby= new LivroFisico(autor);
        ruby.setNome("Livro Ruby on Android");
        ruby.setValor(49.90);

        List<Livro>livros= Arrays.asList(ruby, java);
        Collections.sort(livros, new ComparadorPorNome());
        for(Livro l : livros){
            System.out.println(l.getNome());
        }




        // Lambda Expressions
        // Anonymous Inner Classes
        // Method References
        // Stream API

        // Conceito de default e static methods em interfaces

        // Optional API

        // Navegação com Optional

        // Métodos de extensão

        // Novas APIs de data e tempo

        // Novas features de refatoração

        // Novas features de JavaFX

        // Novas features do Java EE
    }
}
