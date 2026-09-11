package Exercice8;

import java.time.LocalDate;

public class Main {
    static void main() {
        Reservation[] r = new Reservation[3];
        try{
            r[0] = new Reservation("Jean",
                    LocalDate.of(2027, 7, 10),
                    LocalDate.of(2027, 7, 21));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            r[1] = new Reservation("Bob",
                    LocalDate.of(2027, 3, 10),
                    LocalDate.of(2027, 2, 21));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try{
            r[2] = new Reservation("Bob",
                    LocalDate.of(2027, 2, 10),
                    LocalDate.of(2027, 3, 21));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        for (Reservation reservation : r) {
            System.out.println(reservation);
        }
    }
}
