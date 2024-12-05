import models.GerenciadorDeCupons;

import java.util.HashSet;

public class ConsultaDeDescontos {
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciadorDeCupons=  new GerenciadorDeCupons();
        if(gerenciadorDeCupons.verificaSeExisteCupom("CUP91")){

            System.out.println("Cupom Válido ");
        }else{
            System.out.println("Cupom invalido!");
        }


        HashSet<String>set= new HashSet<String>();
        set.add("CURRENT");
        set.add("CURRENT");
        set.add("CURRENT");
        set.add("CURRENT");
        set.add("Pipino");
        set.add("Pipino");
        set.add("Lucas");
        System.out.println(set.size());
    }
}
