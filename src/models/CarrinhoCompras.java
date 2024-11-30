package models;

public class CarrinhoCompras {
    private double total;
    public void adiciona(Livro livro){
        System.out.println("Adicionando: " + livro);
        livro.aplicarDesconto(5);
        total += livro.getValor();
    }
    public double getTotal(){
        return total;
    }
}
