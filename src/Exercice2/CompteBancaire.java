package Exercice2;

public class CompteBancaire {

    private double solde;
    private String titulaire;

    CompteBancaire(double solde, String titulaire) {
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public void deposer(double montant){
        if(montant<0) {
            throw new IllegalArgumentException("Le montant doit être supérieur à 0");
        }
        this.solde += montant;
    }

    public void retirer(double montant){
        if(montant<0) {throw new IllegalArgumentException("Le montant doit être positif");}
        if(solde < montant) {
            throw new IllegalArgumentException("Solde insufisant");
        }
        this.solde -= montant;
    }

    public double getSolde() {
        return this.solde;
    }

    public String getTitulaire() {
        return this.titulaire;
    }
}
