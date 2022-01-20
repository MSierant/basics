package pl.jaksienauczyc.bazgroly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Notatki {
    public static void main(String[] args) {

//aplikacja do zarządzania listą gości i posiłków na imprezie

        Party party = new Party();

        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po nr tel");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch(userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> System.out.println("Wybrano 3");
                case 4 -> System.out.println("Wybrano 4");
                case 5 -> shouldContinue = false;

            }

        }

    }
}