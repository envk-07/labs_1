package ru.mirea.lab1;


public class Task3 {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 9, 4, 6};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = (double) sum / a.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", avg);
    }
}