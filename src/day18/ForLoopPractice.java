package day18;

public class ForLoopPractice {
    public static void main(String[] args) {


        for (int i = 0; i <100 ; i++) {


            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " is Fizz Buzz Number");
            }

        }
    }
}