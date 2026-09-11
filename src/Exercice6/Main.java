package Exercice6;

public class Main {
    static void main() {
        // impossible de faire new Forme() car c'est une classe abstraite qui ne peut pas etre instancier
        Forme[] t = new Forme[3];

        t[0] = new Cercle(2);
        t[1] = new Rectangle(2,2);
        t[2] = new Triangle(2,2);

        for (Forme f : t) {
            f.afficherAire();
        }

        System.out.println(Forme.plusGrande(t));
    }
}
