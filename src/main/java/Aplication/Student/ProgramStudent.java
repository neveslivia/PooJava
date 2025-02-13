package Aplication.Student;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

import static Entities.Rectangle.showResult;
import static Entities.Student.notatotal;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as três notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double total = notatotal(nota1,nota2,nota3);
        System.out.println("FINAL GRADE = " + total);







    }
}
