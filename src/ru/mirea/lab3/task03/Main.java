package ru.mirea.lab3.task03;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + rnd.nextInt(90);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean increasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                increasing = false;
                break;
            }
        }
        System.out.println(increasing
                ? "Массив является строго возрастающей последовательностью"
                : "Массив не является строго возрастающей последовательностью");
    }
}
