package Exercice4;

public class Main {

    static void main() {
        Employe[] t = new Employe[4];

        t[0] = new Employe("Jean", 1600);
        t[1] = new Employe("Philippe", 1600);
        t[2] = new Manager("Ayaaa", 1600, 300);
        t[3] = new Manager("paaaaaaa", 1600, 300);

        for (Employe e : t) {
            System.out.println(e.calculerSalaireBas());
        }
    }
}
