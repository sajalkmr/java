package javalab;

import java.util.ArrayList;
import java.util.Collections;

public class Prog1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        System.out.println("ArrayList before sorting: " + numbers);

        numbers.remove(2);

        System.out.println("ArrayList after removing an element: " + numbers);

        Collections.sort(numbers);

        System.out.println("ArrayList after sorting: " + numbers);

        Integer[] numbersArray = new Integer[numbers.size()];
        numbersArray = numbers.toArray(numbersArray);

        System.out.print("Array obtained from toArray() method: ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
