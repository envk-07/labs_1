package ru.mirea.lab1;

public class Task6 {
    public static void main(String[] args) {
        double sum = 0;
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n;
            sum += term;
            System.out.printf("%2d: 1/%-2d = %.4f  сумма = %.4f%n", n, n, term, sum);
        }
    }
}
