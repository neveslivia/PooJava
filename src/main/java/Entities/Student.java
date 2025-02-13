package Entities;



public class Student {

    public double nota1;
    public double nota2;
    public double nota3;

    public static double notatotal (double a, double b , double c){
        double resultado = (a+b+c);
        return resultado;
    }
    public boolean aprovacao(){
        if(notatotal(double a; double b; double c) > 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
        return aprovacao();

    }
    public static void showResult(double value){
        System.out.printf("Final grade = %.2f", value  );
    }



}
