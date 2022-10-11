package javaFundamentals;

public class Task8 {
    static void find(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            boolean last = true;
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.printf("A[%d] before B[%d]\n", i, j);
                    last = false;
                    break;
                }
            }
            if (last)
                System.out.printf("A[%d] after B[%d]\n", i, arrayB.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] arrayA = {2, 4, 6, 8, 10};
        int [] arrayB = {1, 3, 5, 7, 9};
        find(arrayA, arrayB);
    }
}
