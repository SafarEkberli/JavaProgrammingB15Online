package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        seasonChecker("Winter");
        seasonChecker("Spring");
        seasonChecker("sdf");

    }


    public static void seasonChecker(String season) {
//        String season = "Summer";
        switch (season) {

            case "Spring":
                System.out.println("Hike,Easter,Nawruz,Blossom");
                break;

            case "Summer":
                System.out.println("Swim,Vacation,BBQ,Holiday");
                break;

            case "Fall":
                System.out.println("Black Friday, Hiking,Harvest,Hallowen,Shopping");
                break;

            case "Winter":
                System.out.println("Snowboarding,Ski,Christmas,New Year");
                break;

            default:
                System.out.println("There is no this type season");
                break;


        }

    }
}