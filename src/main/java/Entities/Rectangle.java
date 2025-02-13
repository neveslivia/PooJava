package Entities;

public class Rectangle {


    public  static double area(double x, double y){
       return x * y;
    }
    public static  double Perimeter(double x, double y){
        return 2*(x + y);
    }
    public static double diagonal(double x, double y){
        double diago = Math.sqrt((x*x) + (y*y));
        return diago ;
    }
    public static void showResult(double value){
        System.out.println("A área do retângulo é: " + value);
    }
    public static void showResult2(int value){
        System.out.println("O perìmetro do retângulo é: " + value);
    }
    public static void showResult3(double value){
        System.out.println("O diagonal do retângulo é: " + value);
    }



}
