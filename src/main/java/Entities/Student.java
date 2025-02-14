package Entities;
public class Student {

    public double nota1;
    public double nota2;
    public double nota3;

    public Student(double nota1, double nota2, double nota3) {
        this.nota1 += nota1;
        this.nota2 += nota2;
        this.nota3 += nota3;

    }

    public double resultado() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovacao() {
        if (resultado() > 60) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return String.format("Final grade: " + resultado()+

               String.format ((aprovacao())? "PASS": "FAILED"));
    }
}
