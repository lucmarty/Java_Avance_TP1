package Exercice2;

public class Main {

    static void main() {
        CompteBancaire compte = new CompteBancaire(100, "Lucas");
        System.out.println(compte.getSolde());

        try {
            compte.deposer(-6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(compte.getSolde());
        try {
            compte.retirer(105);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(compte.getSolde());
    }
}
