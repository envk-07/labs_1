package ru.mirea.lab3.task01;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void process(String title, double[] arr) {
        System.out.println(title);
        System.out.println("Исходный массив:     " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный:     " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int n = 8;

        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.round(Math.random() * 10000) / 100.0;
        }
        process("Генерация через Math.random()", a);

        Random rnd = new Random();
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = Math.round(rnd.nextDouble() * 10000) / 100.0;
        }
        process("Генерация через java.util.Random", b);
    }
}
