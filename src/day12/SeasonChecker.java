package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your season please");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring")) {

            System.out.println("Hiking,Novruz,Alergy Season");

        }else if (season.equalsIgnoreCase("summer")){
            System.out.println("Pool,Swimming,Beach,Vacation");
        }else if (season.equalsIgnoreCase("fall")){
            System.out.println("Halloween");
        }else if (season.equalsIgnoreCase("winter")){
            System.out.println("Ski,snowman");
        }else {
            System.out.println("Not Valid!!!");
        }
    }
}
