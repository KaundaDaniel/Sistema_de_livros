package models;

public class Ebook extends Livro implements Promocional{
    private String waterMark;
    public Ebook(Autor autor) {
        super(autor);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    @Override
    public boolean aplicarDesconto(double percentagem) {
        double calculaPercenta = percentagem/100;
        if(calculaPercenta>0.15){
            System.out.println("Desconto excede o limite máximo de 15%!");
            return false;
        } else {
//            double novoValor = getValor() - (getValor() * calculaPercenta);
           setValor(getValor() - (getValor() * calculaPercenta));
            //super.aplicarDesconto(calculaPercenta);
            System.out.println("Valor de Ebook com desconto: " + getValor());
            return true;
        }
    }
}
