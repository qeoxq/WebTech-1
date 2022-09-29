package javaFundamentals;

import java.util.Arrays;

public class Task7 {
    static int[] shellSort (int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
            else i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] resultArray = shellSort(new int[]{1, 3, 5, 8, 2, 0});
        System.out.println(Arrays.toString(resultArray));
    }
}
