package Exercice1;

public class Main {

    static void main() {
        Livre livre1 = new Livre("La foret", "Jean", 212);
        Livre livre2 = new Livre("LA", "Jean", 304);

        livre1.rendre();
        livre2.rendre();

        System.out.println(livre1.toString());
        System.out.println(livre2.toString());


        livre1.emprunter();
        livre2.emprunter();

        livre1.emprunter();

        System.out.println(livre1.toString());
        System.out.println(livre2.toString());

    }
}
