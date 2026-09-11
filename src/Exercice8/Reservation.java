package Exercice8;

import java.time.LocalDate;
import java.time.Period;

public class Reservation {
    private String nomClient;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart) {
        if (dateDepart.isBefore(dateArrivee)) {
            throw new IllegalArgumentException();
        }
        this.nomClient = nomClient;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    public Period dureeSejour() {
        return Period.between(dateArrivee, dateDepart);
    }

    @Override
    public String toString() {
        return nomClient + " " + dateArrivee + " " + dateDepart + " durée:" + dureeSejour().getDays() + " saison:" + Reservation.estEnHauteSaison(this.dateArrivee);
    }

    public static boolean estEnHauteSaison(LocalDate date) {
        return date.getMonth().getValue() == 7 || date.getMonth().getValue() == 8;
    }
}
