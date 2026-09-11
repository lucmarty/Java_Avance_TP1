package Exercice10;

public class SoldeInsuffisantException extends Exception {
    private double montantManquant;

    public SoldeInsuffisantException(String message, double montantManquant) {
        this.montantManquant = montantManquant;
        super(message);
    }

    public double getMontantManquant() {
        return montantManquant;
    }
}
