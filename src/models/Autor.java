package models;

public class Autor {
    private String nome;
    private String email;
    private String bi;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public void mostraDetalhes() {
        System.out.println("""
                Mostra Detalhes do Autor""");

        System.out.println("Nome do Autor: " + nome);
        System.out.println("Email do Autor: " + email);
        System.out.println("BI do Autor: " + bi);
        System.out.println("--------");
    }
}
