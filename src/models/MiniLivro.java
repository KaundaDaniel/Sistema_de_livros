package models;

public class MiniLivro extends Livro{
    private int paginas;
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double percentagem) {
        return false;
    }
}
