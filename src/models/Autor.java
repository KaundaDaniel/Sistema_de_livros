package models;

public class Autor {
    public String nome;
    public String email;
    public String bi;
    public void mostraDetalhes() {
        System.out.println("""
                Mostra Detalhes do Autor""");

        System.out.println("Nome do Autor: " + nome);
        System.out.println("Email do Autor: " + email);
        System.out.println("BI do Autor: " + bi);
        System.out.println("--------");
    }
}
