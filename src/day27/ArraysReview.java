package day27;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10,20,30,40,50,60};

       int num1 = arr[arr.length-1];
        System.out.println(num1);


        for (int x = 0; x <arr.length ; x++) {

            System.out.println(arr[x] + " ");




        }
        System.out.println("\n===============");
        System.out.println(Arrays.toString(arr));
    }
}
