package Exercice3;

public class Main {
    static void main() {
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(2, 5);
        Rectangle R3 = new Rectangle(3);

        System.out.println("R1 : ");
        System.out.println(R1.aire());
        System.out.println(R1.perimetre());

        System.out.println("----------------------------");

        System.out.println("R2 : ");
        System.out.println(R2.aire());
        System.out.println(R2.perimetre());

        System.out.println("----------------------------");

        System.out.println("R3 : ");
        System.out.println(R3.aire());
        System.out.println(R3.perimetre());


    }
}
