package pl.jaksienauczyc.bazgroly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {

    private List<String> guests = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    //metoda na dodanie goscia bez scannera początkowa:
//    public void addGuest (String name) {
//        guests.add(name);
//    }

//metoda na dodanie gościa
    public void addGuest () {
        System.out.println("Podaj imię gościa: ");
        String name = scanner.nextLine();
        guests.add(name);
    }

    // początkowa metoda na zwrócenie listy gości
//        public List<String> getGuests() {
//            return guests;
//        }

    //metoda na zwrócenie listy gości
    public void displayGuests() {
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
