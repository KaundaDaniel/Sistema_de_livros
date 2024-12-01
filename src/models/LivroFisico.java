package models;

public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double percentagem) {
        double calculaPercenta = percentagem/100;
        if(calculaPercenta>0.3){
            System.out.println("Desconto excede o limite máximo de 30%!");
            return false;
        }else {
            this.setValor(this.getValor()-(this.getValor()*calculaPercenta));
            System.out.println("Valor do Livro com desconto: " + this.getValor());
            return true;
        }
    }

    public double getTaxaImpressao(){
        return this.getValor()*0.05;
    }

}
