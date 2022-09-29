package javaFundamentals;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.tan;

public class Task3 {
    static List<List<Double>> calculate(double a, double b, double h) {
        List<List<Double>> table = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            List<Double> temp = new ArrayList<>();
            temp.add(x);
            temp.add(tan(x));
            table.add(temp);
        }
        return table;
    }

    private static void print(final List<List<Double>> table) {
        table.forEach(System.out::println);
    }

    public static void main(String[] args) {
        print(calculate(0, 20, 4));
    }
}
