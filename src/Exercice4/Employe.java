package Exercice4;

public class Employe {

    protected String nom;
    protected double salaireBas;

    Employe(String nom, double salaireBas) {
        this.nom = nom;
        this.salaireBas = salaireBas;
    }

    double calculerSalaireBas() {
        return salaireBas;
    }
}
