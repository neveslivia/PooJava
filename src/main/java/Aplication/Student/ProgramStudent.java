package Aplication.Student;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;




public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as três notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
       Student student = new Student(nota1,nota2,nota3);
        System.out.println(student);







    }
}
