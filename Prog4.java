package javalab;

public class Prog4 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        System.out.println("String 1: " + str1);

        char[] charArray = {'J', 'a', 'v', 'a'};
        String str2 = new String(charArray);
        System.out.println("String 2: " + str2);

        char[] charArray2 = {'S', 't', 'r', 'i', 'n', 'g', 's'};
        String str3 = new String(charArray2, 2, 4);
        System.out.println("String 3: " + str3);

        byte[] byteArray = {65, 66, 67};
        String str4 = new String(byteArray);
        System.out.println("String 4: " + str4);

        byte[] byteArray2 = {68, 69, 70, 71, 72};
        String str5 = new String(byteArray2, 1, 3);
        System.out.println("String 5: " + str5);

        String str6 = new String(str1);
        System.out.println("String 6: " + str6);
    }
}
