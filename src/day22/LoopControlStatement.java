package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        String msg = "I struggle with Java I like Java I love Java Everything is Awesome";


        int charCount = msg.length();
        System.out.println("Char Count= " + charCount);

        for (int idx = 0; idx < charCount; idx++) {
            if (idx % 2 == 1) {
                continue;
            }
            System.out.println(idx + " : " + msg.charAt(idx + 1));

        }
        for (int idx = 0; idx < charCount; idx++) {
            String currentChar = msg.substring(idx, idx+1);
            if (currentChar.equalsIgnoreCase("a")){
                break;
            }
            System.out.println("currentChar = " + currentChar);
            

        }

    }


}


