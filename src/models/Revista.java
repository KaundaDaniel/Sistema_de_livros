package models;

public class Revista implements Produto, Promocional{
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public boolean aplicarDesconto(double percentagem){
        double valorPercentagem=percentagem/100;
        if (valorPercentagem>0.1){
            return false;
        }else{
            double novoValor=getValor()-getValor()*valorPercentagem;
            setValor(novoValor);
            return true;
        }
    }

    @Override
    public double getValor() {
        return 0;
    }


}
