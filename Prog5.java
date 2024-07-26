package javalab;

public class Prog5 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";
        String str3 = "Hello";

       
        char ch1 = str1.charAt(7);
        System.out.println("Character at index 7: " + ch1);
        
        String subStr = str1.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + subStr);
        
  
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!");
        System.out.println("str1 equals 'hello, world!' (ignore case): " + isEqualIgnoreCase);

        int comparisonResult = str1.compareTo(str2);
        System.out.println("Comparison result of str1 and str2: " + comparisonResult);

        
        int indexOfWord = str1.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWord);

        int lastIndexOfChar = str1.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndexOfChar);

        boolean containsWord = str1.contains("World");
        System.out.println("str1 contains 'World': " + containsWord);

        
        String replacedStr = str1.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedStr);

        String upperStr = str1.toUpperCase();
        System.out.println("Upper case: " + upperStr);

        String lowerStr = str1.toLowerCase();
        System.out.println("Lower case: " + lowerStr);

        String trimmedStr = "   Trimmed String   ".trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        String concatenatedStr = str1.concat(" Have a great day!");
        System.out.println("Concatenated string: " + concatenatedStr);

        String[] words = str1.split(", ");
        System.out.println("Splitted string: ");
        for (String word : words) {
            System.out.println(word);
        }

        String joinedStr = String.join(" - ", words);
        System.out.println("Joined string: " + joinedStr);
    }
}
