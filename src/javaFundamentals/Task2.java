package javaFundamentals;

import static java.lang.Math.abs;

public class Task2 {

    static boolean calculate(final double x, final double y) {
        final var resultFirst = (((y >= 0) && (y <= 5)) && (abs(x) <= 4));
        final var resultSecond = (((y <= 0) && (y >= -3)) && (abs(x) <= 6));
        return (resultFirst || resultSecond);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + calculate(0, 0));
    }
}
