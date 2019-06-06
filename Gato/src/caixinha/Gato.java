package caixinha;

public class Gato {
    int cr;
    String nome;
    String raca;
    int idade;
    boolean male;

    public Gato(String g) {
        this.nome = g;
    }

    public void miar() {
        if (idade >= 2) {
            System.out.println(" Meow! ");
        } else {
            System.out.println(" miauh miauh miauh ");
        }
    }
}
