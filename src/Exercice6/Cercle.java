package Exercice6;

public class Cercle extends Forme {

    private double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * this.rayon * this.rayon;
    }
}
