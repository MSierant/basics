import java.util.Scanner;

/**
 5. Pobierz od użytkownika dowolny tekst, następnie pobierz liczbę.Następnie spytaj, czy
 wydrukować dany tekst. W zależności od odpowiedzi, 1 oznacza tak, 2 oznacza nie, wykonaj zadanie ,
 tzn. wydrukuj tyle razy, jaką liczbę podał użytkownik. Jeśli użytkownik wpisze coś innego
 niż 1 lub 2, wypisz „nie zrozumiałem, wybierz odpowiedź jeszcze raz”.
 */
public class Main {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny tekst");
        String text = scanner.next();

        System.out.println("Podaj dowolną liczbę");
        int number = scanner.nextInt();

        System.out.println("Wydrukować?  1 = tak, 2= nie");
        int print = scanner.nextInt();
                if (print ==1) {
                    System.out.println("ile razy wydrukować?");






    }

}