package javaFundamentals;

public class Task8 {
    public static void sortedInsert(int [] seq1, int [] seq2) {
        for (int i = 0; i < seq1.length; i++) {
            boolean last = true;
            for (int j = 0; j < seq2.length; j++) {
                if (seq1[i] < seq2[j]) {
                    System.out.printf("a[%d] => перед b[%d]\n", i, j);
                    last = false;
                    break;
                }
            }
            if (last)
                System.out.printf("a[%d] => после b[%d]\n", i, seq2.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {-3, 0, 3, 5, 6, 8, 10, 15, 18};
        int[] b = {-2, 1, 2, 4, 5, 7, 9, 11, 16};
        sortedInsert(a, b);
    }
}
