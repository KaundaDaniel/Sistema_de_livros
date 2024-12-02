package models;

public class CarrinhoCompras {
    private double total;
    private Produto [] prods=new Produto[10];
    int cont=0;


    public void adiciona(Produto produto){
        prods[cont] = produto;
        cont++;
       //produto.aplicarDesconto(5);
        total += produto.getValor();
    }

    public void adciona(Revista revista){
        System.out.println("Adicionando: " + revista);
        revista.aplicarDesconto(10);
        total += revista.getValor();
    }

    public void getProds() {
        for (int i = 0; i <= prods.length; i++) {
            try {
                Produto prod = prods[i];
                if (prods != null) {
                    System.out.println("Adicionando: " + prods);
                    total += prod.getValor();
                }
            } catch (Exception e) {
                System.out.println("Deu Exception no indice! " + i);
                e.printStackTrace();


            }finally {
                System.out.println("Executou o finally");
            }

        }
    }
    public double getTotal () {
        return total;
    }
}
