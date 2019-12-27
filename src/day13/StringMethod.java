package day13;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equalsIgnoreCase("Hello"));
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());

        int lengthOfStr = s1.length();
        if(lengthOfStr>4){
            System.out.println("More than 4 characters");
        }else {
            System.out.println("Not more than 4 characters");
        }
    }
}
