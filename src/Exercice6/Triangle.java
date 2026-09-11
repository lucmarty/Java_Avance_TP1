package Exercice6;

public class Triangle extends Forme {

    private double base;
    private double hauteur;

    Triangle (double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        return (base * hauteur) / 2;
    }
}
