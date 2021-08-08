package pl.jaksienauczyc;

import javax.print.attribute.standard.Sides;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Czy można zrobić trójkąt prostokątny z podanych odcinków?");

        System.out.println(canConstructRectangularTriangle(3,5,4));
    }
   private static boolean canConstructRectangularTriangle (double a, double b, double c){
        if (a < 0 || b < 0 || c < 0){
            return false;
        }
       double[] sides = {a, b, c};
       Arrays.sort(sides);
       return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
   }

}
