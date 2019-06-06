package caixinha;

public class Gato {
    int cr;
    String nome;
    String raca;
    int idade;
    boolean male = true;
    Gato mother;
    
    public Gato(String g) {
        this.nome = g;
    }

    public void miar() {
        if (idade >= 2) {
            System.out.printf("%s vai dizer Meow!\n", this.name);
        } else {
            System.out.printf("%s vai dizer Miauh Miauh Miauh!\n", this.name);
        }
    }
}
