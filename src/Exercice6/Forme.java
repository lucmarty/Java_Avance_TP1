package Exercice6;

public abstract class Forme {

    public abstract double aire();

    void afficherAire() {
        System.out.println("Aire :" + this.aire());
    }

    public static Forme plusGrande(Forme[] forme) {
        Forme f0 = null;
        double aire = 0.0;

        for (Forme f : forme) {
            if (f == null || aire < f.aire()) {
                f0 = f;
                aire = f.aire();
            }
        }
        return f0;
    }
}
