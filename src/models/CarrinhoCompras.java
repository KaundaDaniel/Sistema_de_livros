package models;

public class CarrinhoCompras {
    private double total;
    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
       //produto.aplicarDesconto(5);
        total += produto.getValor();
    }

    public void adciona(Revista revista){
        System.out.println("Adicionando: " + revista);
        revista.aplicarDesconto(10);
        total += revista.getValor();
    }
    public double getTotal(){
        return total;
    }
}
