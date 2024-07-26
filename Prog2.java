package javalab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

class TensPlaceComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        int tensPlace1 = (num1 % 100) / 10;
        int tensPlace2 = (num2 % 100) / 10;
        return Integer.compare(tensPlace1, tensPlace2);
    }
}

public class Prog2 {
    public static void main(String[] args) {
        int min = 100; 
        int max = 1000; 
        int count = 10; 

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(max - min) + min;
            } while (randomNumber % 2 != 0 || randomNumber % 5 != 0);
            numbers.add(randomNumber);
        }

        System.out.println("Unsorted numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        numbers.sort(new TensPlaceComparator());

        System.out.println("\nSorted numbers according to tens place:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
