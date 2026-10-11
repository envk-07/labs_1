package ru.mirea.lab3.task04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int readSize(Scanner sc) {
        while (true) {
            System.out.print("Введите размер массива (натуральное число): ");
            if (!sc.hasNext()) {
                throw new IllegalStateException("Ввод закончился");
            }
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n > 0) {
                    return n;
                }
            } else {
                sc.next();
            }
            System.out.println("Некорректное значение, повторите ввод.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readSize(sc);

        Random rnd = new Random();
        int[] arr = new int[n];
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(n + 1);
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        if (evenCount == 0) {
            System.out.println("Четных элементов нет");
            return;
        }
        int[] even = new int[evenCount];
        int j = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                even[j++] = v;
            }
        }
        System.out.println("Четные элементы: " + Arrays.toString(even));
    }
}
