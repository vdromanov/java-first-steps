package test.demo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Песатт ");
        String n = input.nextLine();
        System.out.println ("Вы нопемсали "+n);
        System.out.println ("Сторона квадрата");
        Kvadrat numberOne = new Kvadrat();
        Kvadrat numberTwo = new Kvadrat();
        numberOne.a = input.nextFloat();
        numberTwo.a = input.nextFloat();
        Float rez = numberOne.getArea()/numberTwo.getArea();
        System.out.println (rez);
    }
}