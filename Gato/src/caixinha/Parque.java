
package caixinha;

public class Parque {
public static int main (String [] args) {
Gato puppy= new Gato ("Sol");
puppy.nome = "Judas";
puppy.mia ();
Gato gata = new Gato ("Macabea");
gata.idade = 4; gata.femea = true;
gata.mia ();
puppy.mae = gata;
return 0;
    }
    
}
