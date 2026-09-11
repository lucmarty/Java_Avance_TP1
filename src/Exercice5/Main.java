package Exercice5;

public class Main {
    static void main() {
        Produit p1 = new Produit("pomme", 100);

        p1.afficher();
        p1.afficher(50);
        p1.afficher("EUR");
    }
}
