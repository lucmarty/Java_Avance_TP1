package Exercice1;

public class Livre {

    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true;
    }

    void emprunter() {
        if (this.disponible) {
            this.disponible = false;
        } else {
            System.out.println("Le livre ("+ this.toString() +") n'est pas disponible");
        }
    }

    void rendre() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return titre + " " + auteur + " " + nombrePages + " " + disponible;
    }
}
