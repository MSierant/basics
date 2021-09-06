package pl.jaksienauczyc;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int iloscLiczb =5, suma=0, i, liczba, min, max;

        System.out.println("Program losuje " + iloscLiczb + " liczb calkowitych od 0 do 99");
        System.out.println(" a następnie znajduje najmniejszą i największą");
        System.out.println("oraz oblicza średnią z wylosowanych liczb");
        Random r = new Random();
        max = r.nextInt(100);
        System.out.print("wylosowano liczby: " );



        for (i = 1; i <= iloscLiczb; i++)
        {
            liczba= r.nextInt(100);
            System.out.print(liczba + ", ");

            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma +=liczba;
        }
        System.out.println();
        System.out.println("najmniejsza liczba to " + min);
        System.out.println("największa liczba to " + max);

    }
}






