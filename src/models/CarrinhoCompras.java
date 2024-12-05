package models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarrinhoCompras {
    private double total;
    private List<Produto> prods;
    int cont=0;

    public CarrinhoCompras() {
        this.prods = new ArrayList<>();
    }

    public void adiciona(Produto produto){
       this.prods.add(produto);
    }
    public void remove(int posicao){
        this.prods.remove(posicao);
    }

    public double getTotal () {
        return total;
    }

    public List<Produto>getProds(){
        return prods;
    }
}
