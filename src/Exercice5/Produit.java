package Exercice5;

public class Produit {
    private String nom;
    private double prix;

    Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    void afficher() {
        System.out.println("Nom :" + this.nom + " Prix :" + this.prix);
    }

    void afficher(double remise) {
        System.out.println("Nom :" + this.nom + " Prix avec remise :" + (this.prix - (this.prix * (remise / 100))));
    }

    void afficher(String devise) {
        System.out.println("Nom :" + this.nom + "Prix : " + this.prix + devise);
    }
}
