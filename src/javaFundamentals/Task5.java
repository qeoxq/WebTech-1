package javaFundamentals;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 4, 3, 4, 5, 2, 1};

        int[] d = new int[array.length];

        for (int i = 0; i < array.length; ++i) {
            d[i] = 1;
            for (int j = 0; j < i; ++j)
                if (array[j] < array[i])
                    d[i] = Math.max(d[i], 1 + d[j]);
        }

        int max = d[0];
        for (int i = 0; i < array.length; ++i)
            max = Math.max(max, d[i]);

        System.out.println("\nK = " + (array.length - max));
    }
}
