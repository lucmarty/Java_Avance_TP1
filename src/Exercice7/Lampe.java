package Exercice7;

public class Lampe implements Allumable {

    private boolean allume;
    Lampe() {
        this.allume = false;
    }

    @Override
    public void allumer() {
        this.allume = true;
    }

    @Override
    public void eteindre() {
        this.allume = false;
    }
}
