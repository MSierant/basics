package pl.jaksienauczyc;

import java.time.LocalDate;
import java.time.Period;
// do dopracowania
public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1991,3,7);
        int years = Period.between(dateOfBirth,today).getYears();

        System.out.println("masz lat " +years);
        System.out.println("dzisiaj jest: " + today);


    }
}
