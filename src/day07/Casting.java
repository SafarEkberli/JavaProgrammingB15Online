package day07;

public class Casting {

    public static void main(String[] args) {

//        int num = 10;
        double bigNum = 10;
        System.out.println(bigNum);

        int num = (int) 12.99;
        System.out.println(num);

        long earthToMoon = 10000;
        int earthToMoonIn = (int) earthToMoon;

        System.out.println(earthToMoonIn);
    }
}
