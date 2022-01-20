package pl.jaksienauczyc.bazgroly;

import java.util.Scanner;
/* program oblicza ilość punktów rozwoju na jaką nas stać w grze "Forge of Empires" */

public class ForgePoints {
    public static void main (String args[])
    {
        int suma = 0;

       Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość złota jaką posiadasz w FoE");
        int goldAmount = scanner.nextInt();

        System.out.println("Wpisz ile kosztuje Cię aktualnie kupno 1PR");
        int costPoint = scanner.nextInt();

        for(int i = costPoint; i<=goldAmount; i=i+50) {

           goldAmount = goldAmount-i;
           suma= suma+1;
            System.out.println("Pkt rozwoju kosztuje: " + i);
            System.out.println("suma pkt: " + suma);
            System.out.println("pozostała ilość złota: " + goldAmount);
            System.out.println("-------------------------");
       }

        System.out.println("Stać Cię na kupno " + suma + " punktów rozwoju");








    }

}