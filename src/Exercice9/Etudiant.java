package Exercice9;

import java.util.Objects;

public class Etudiant {
    private String numeroEtudiant;
    private String nom;
    private double moyenne;

    Etudiant(String numeroEtudiant, String nom, double moyenne) {
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return numeroEtudiant + " " + nom + " " + moyenne;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Etudiant) {
            Etudiant e = (Etudiant) obj;
            return e.numeroEtudiant == this.numeroEtudiant;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroEtudiant);
    }
}
