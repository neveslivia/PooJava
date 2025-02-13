package Aplication.Rectangle;


import java.util.Locale;
import java.util.Scanner;

import static Entities.Rectangle.*;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        double w= sc.nextDouble();
        double h = sc.nextDouble();

       double rectangle = area(w,h);
       double perimeter = Perimeter(w,h);
       double diagonal = diagonal(w,h);

       showResult((int) rectangle);
        showResult2((int) perimeter);
        showResult3((int) diagonal);








    }


}
