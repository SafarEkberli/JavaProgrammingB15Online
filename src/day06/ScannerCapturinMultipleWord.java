package day06;

import java.util.Scanner;

public class ScannerCapturinMultipleWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = blabla.next();
//        String anotherWord = blabla.next();
        int age = blabla.nextInt();

        System.out.println("You have entered " +name);
        System.out.println("");

    }
}
