
package caixinha;

public class Parque {

    public static void main(String[] args) {
        Gato filhote = new Gato("Sphynx");
        filhote.name= "Spy";
        filhote.miar();
        filhote.cr = 13;
        Gato gata = new Gato("Spyx");
        gata.idade = 3; gata.male= false;
        gata.miar();
        filhote.mother = gata;

    }
    
}