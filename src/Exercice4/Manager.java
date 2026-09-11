package Exercice4;

public class Manager extends Employe{

    private double prime;

    Manager(String nom, double salaireBas, double prime) {
        this.prime = prime;
        super(nom, salaireBas);
    }

    @Override
    double calculerSalaireBas() {
        return this.salaireBas + prime;
    }
}
