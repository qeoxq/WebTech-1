package javaFundamentals;

import java.util.Arrays;

public class Task5 {
    public static int getCountOfRedundantMembers(int[] array) {

        if (array.length < 2)
            return 0;

        int[] lengthOfSubsequence = new int[array.length];

        for (int j = 1; j < array.length; j++)
            for (int k = 0; k < j; k++)
                if (array[j] > array[k])
                    if (lengthOfSubsequence[j] <= lengthOfSubsequence[k])
                        lengthOfSubsequence[j] = lengthOfSubsequence[k] + 1;

        int maxLength = 0;
        for (int length : lengthOfSubsequence)
            if (length > maxLength)
                maxLength = length;

        return array.length - maxLength - 1;
    }

    public static void main(String[] args) {
        int[] array1 = {};
        int[] array2 = {1, 2, 3, 10, 4, 5, 6};
        int[] array3 = {4, 3, 2, 1};
        int[] array4 = {1, 2, 3, 4, 5};
        int[] array5 = {1, 3, 2, 4, 5, 6, 8, 7, 9, 10};
        int[] array6 = {1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(array1) + ": " + Task5.getCountOfRedundantMembers(array1));
        System.out.println(Arrays.toString(array2) + ": " + Task5.getCountOfRedundantMembers(array2));
        System.out.println(Arrays.toString(array3) + ": " + Task5.getCountOfRedundantMembers(array3));
        System.out.println(Arrays.toString(array4) + ": " + Task5.getCountOfRedundantMembers(array4));
        System.out.println(Arrays.toString(array5) + ": " + Task5.getCountOfRedundantMembers(array5));
        System.out.println(Arrays.toString(array6) + ": " + Task5.getCountOfRedundantMembers(array6));
    }
}
