package Exercice9;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Etudiant> etd = new ArrayList<>();

        etd.add(new Etudiant("1", "Jean", 16));
        etd.add(new Etudiant("2", "Paul", 12));
        etd.add(new Etudiant("3", "Marc", 4));

        Etudiant test1 = new Etudiant("1", "Lucas", 2);
        Etudiant test2 = new Etudiant("99", "Jean", 16);

        System.out.println("contains test1 : " + etd.contains(test1));
        System.out.println("contains test2 : " + etd.contains(test2));

        System.out.println(
                "equals : " +
                        etd.get(0).equals(new Etudiant("1", "N'importe qui", 0))
        );
    }
}