package pl.jaksienauczyc.bazgroly;

// obliczanie pierwiastków równania kwadratowego ax^2+bx+c=0

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class bazgroly1 {

    public static void main(String[] args)
            throws IOException {
        double delta, x1, x2;
        System.out.println("Program oblicza pierwiastki równania kwadratowego ax^2 + bx +c = 0");
        System.out.println("podaj a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("niedozwolona wartość, 'a' nie może być równe 0");
        } else {
            System.out.println("podaj b: ");
            double b = scanner.nextDouble();
            System.out.println("podaj c: ");
            double c = scanner.nextDouble();
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Brak pierwiastków rzeczywistych");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Dla a= " + a + " b= " + b + " c= " + c + "trójmian ma jeden pierwiastek podwójny x1= " + x1);
            }
            else {
                x1= (-b-Math.sqrt(delta))/(2*a);
                x2= (-b+Math.sqrt(delta))/(2*a);
                System.out.println("Dla a= " + a + " b= " + b + " c= " + c + "trójmian ma dwa pierwiastki x1= " + x1 + " x2 = " + x2);
            }

        }
    }

    }


