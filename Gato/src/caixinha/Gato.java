package caixinha;

public class Gato {
    int cr;
    String name;
    String raca;
    int idade;
    boolean male;

    public Gato(String g) {
        this.name = g;
    }

    public void miar() {
        if (idade >= 2) {
            System.out.println(" Meow! ");
        } else {
            System.out.println(" miauh miauh miauh ");
        }
    }
}
