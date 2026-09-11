package Exercice3;

public class Rectangle {

    private double largeur;
    private double hauteur;

    Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    Rectangle(double cote) {
        this(cote, cote);
    }

    Rectangle() {
        this(1,1);
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2*largeur + 2*hauteur;
    }
}
