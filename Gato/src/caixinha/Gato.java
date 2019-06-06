package caixinha;

public class Gato {
    int cr;
    String name;
    String raca;
    int idade;
    boolean male = true;
    Gato mother;
    
    public Gato(String g) {
        this.name = g;
    }

    public void miar() {
        if (idade >= 2) {
            System.out.printf("%s vai dizer Meow!\n", this.name);
        } else {
            System.out.printf("%s vai dizer Miauh Miauh Miauh!\n", this.name);
        }
    }
}
