package day17;

public class FizzBuzzNumber {
    public static void main(String[] args) {
        int num = 1;
        while (num<=100){


            if (num%5==0 && num%3==0){
                System.out.println(num+ " FizzBuzz number");
            }else if (num%5==0){
                System.out.println(num+ " Fizz number");
            }else if (num%3==0){
                System.out.println(num+" Buzz number");
            }

            ++num;
        }
    }
}
