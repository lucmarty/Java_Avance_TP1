package Exercice10;

public class CompteBancaire {
    private double solde;
    private String titulaire;

    CompteBancaire(double solde, String titulaire) {
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public void retirer(double montant) throws SoldeInsuffisantException  {
        if (montant > this.solde) {
            throw new SoldeInsuffisantException("Solde Insufisant", (montant - solde));
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
