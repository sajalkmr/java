package javalab;

public class Prog6 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);

        stringBuffer.append(" World!");
        System.out.println("After append(): " + stringBuffer);

        stringBuffer.insert(5, ", Java");
        System.out.println("After insert(): " + stringBuffer);

        stringBuffer.delete(5, 11);
        System.out.println("After delete(): " + stringBuffer);

        stringBuffer.deleteCharAt(5);
        System.out.println("After deleteCharAt(): " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("After reverse(): " + stringBuffer);

        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);

        stringBuffer.setLength(5);
        System.out.println("After setLength(): " + stringBuffer);

        stringBuffer.ensureCapacity(30);
        System.out.println("After ensureCapacity(): " + stringBuffer);

        char charAtIndex = stringBuffer.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex);

        int indexOfSubstring = stringBuffer.indexOf("llo");
        System.out.println("Index of 'llo': " + indexOfSubstring);

        String substring = stringBuffer.substring(1, 3);
        System.out.println("Substring from index 1 to 3: " + substring);

        stringBuffer.replace(1, 3, "i");
        System.out.println("After replace(): " + stringBuffer);
    }
}
