package pl.age.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public  class AgeCalculator {


    public static void calculateDays(String date, DateTimeFormatter formatter) {

        try {
            LocalDate date1 = LocalDate.parse(date, formatter);

            long daysBetween = ChronoUnit.DAYS.between(date1, LocalDate.now());

            System.out.println("od twoich urodzin minęło: " + daysBetween + " dni");

        } catch (
                DateTimeParseException ex) {
            System.out.println("wprowadzono niepoprawne dane, spróbuj ponownie");
        }
    }
}
