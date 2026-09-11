package Exercice10;

public class Main {
    static void main() {
        CompteBancaire compte = new CompteBancaire(200, "Lucas");

        try {
            compte.retirer(201);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur : "+ e.getMessage());
            System.out.println("Montant manquant : " + e.getMontantManquant());
        } finally {
            System.out.println("Solde : " + compte.getSolde());
        }
    }
}
