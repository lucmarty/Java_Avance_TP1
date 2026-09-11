package Exercice7;

public class Main {
    static void main() {
        Allumable[] a =  new Allumable[2];

        a[0] = new TelephonePortable();
        a[1] = new Lampe();

        for (Allumable a1 : a) {
            a1.allumer();
            if (a1 instanceof ConnectWifi) {
                ((ConnectWifi) a1).connecter("abcdefg");
            }
        }
    }
}
