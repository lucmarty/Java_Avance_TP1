package Exercice7;

public class TelephonePortable implements Allumable, ConnectWifi {

    private boolean allume;
    private String reseauConnecte;

    TelephonePortable() {
        allume = false;
        reseauConnecte = null;
    }

    @Override
    public void allumer() {
        this.allume = true;
    }

    @Override
    public void eteindre() {
        this.allume = false;
    }

    @Override
    public void connecter(String reseau) {
        this.reseauConnecte = reseau;
    }

    @Override
    public void deconnecter() {
        this.reseauConnecte = null;
    }
}
