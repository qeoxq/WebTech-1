package javaFundamentals;

import static java.lang.Math.*;

public class Task1 {

    static double calculate(double x, double y) {
        double resultNumerator = 1 + pow(sin(x + y), 2);
        double resultDenominator = 2 + abs(x - ((2 * x) / (1 + (pow(x, 2) * pow(y, 2)))));
        return ((resultNumerator / resultDenominator) + x);
    }

    public static void main(String[] args) {
        System.out.printf("Result = %f", calculate(3, 4));
    }
}
