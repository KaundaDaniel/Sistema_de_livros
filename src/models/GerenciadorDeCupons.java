package models;

import java.util.*;

public class GerenciadorDeCupons {
    private Map<String, Double>cupons;
    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();
        cupons.put("CUP74", 0.1);
        cupons.put("CUP158", 0.2);
        cupons.put("CUP14", 0.05);
        cupons.put("CUP52", 0.15);
        cupons.put("CUP21", 0.1);
        cupons.put("CUP221", 0.2);
        cupons.put("CUP91", 0.05);
        cupons.put("CUP327", 0.15);
        cupons.put("CUP410", 0.2);
        cupons.put("CUP275", 0.1);
        cupons.put("CUP484", 0.2);
    }
    //Set<String > cupons;
   /* public GerenciadorDeCupons() {
        this.cupons = new HashSet<String>();

        cupons.addAll(Arrays.asList("CUP74", "CUP158",
                "CUP14", "CUP52", "CUP21", "CUP221", "CUP91",
                "CUP327", "CUP410", "CUP275", "CUP484", "CUP207",
                "CUP96", "CUP119", "CUP174", "CUP291", "CUP1",
                "CUP115", "CUP222", "CUP272"));

    }*/

    public boolean verificaSeExisteCupom(String cupom) {
        return cupons.containsKey(cupom);
    }
    public double getDesconto(String cupom) {
        return cupons.get(cupom);
    }
}
