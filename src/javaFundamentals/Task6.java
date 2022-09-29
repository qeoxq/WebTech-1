package javaFundamentals;

public class Task6 {
    static int[][] createNewMatrix(int[] array) {
        int[][] matrix = new int[array.length][array.length];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = array[counter];
                if (counter == 4) {
                    counter = 0;
                } else {
                    counter++;
                }
            }
            counter++;
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = createNewMatrix(new int[]{1, 2, 3, 4, 5});
        printMatrix(matrix);
    }
}
