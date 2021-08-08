package pl.jaksienauczyc;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        System.out.println("Podaj liczbę od 0 do 100");

        while (!wasNumberGuessed) {

            int userNumber = scanner.nextInt();
            if (userNumber > numberToGuess) {
                System.out.println("Podaj mniejszą liczbę");
            } else if (userNumber < numberToGuess) {
                System.out.println("Podaj większą liczbę");
            } else {
                        System.out.println( "Brawo zgadłeś");
                        wasNumberGuessed = true;
                    }
                }
            }
        }



