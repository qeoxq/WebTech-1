package javaFundamentals;

import java.util.ArrayList;
import java.util.List;


public class Task4 {
    static boolean isPrime(final int number) {
        for(int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Integer> searchElements(final int[] array) {
        List<Integer> listOfElements = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                listOfElements.add(i + 1);
            }
        }
        return listOfElements;
    }

    public static void main(String[] args) {
        List<Integer> result = searchElements(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37});
        System.out.println(result);
    }
}
