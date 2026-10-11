package ru.mirea.lab3.task05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// В методичке задание 5 дословно повторяет задание 4, поэтому здесь
// реализован вариант: второй массив содержит нечетные элементы, а
// ввод проверяется через nextLine() + Integer.parseInt().
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Введите размер массива (натуральное число): ");
            if (!sc.hasNextLine()) {
                throw new IllegalStateException("Ввод закончился");
            }
            try {
                n = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                n = 0;
            }
            if (n <= 0) {
                System.out.println("Некорректное значение, повторите ввод.");
            }
        }

        Random rnd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(n + 1);
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        int[] odd = Arrays.stream(arr).filter(v -> v % 2 != 0).toArray();
        System.out.println(odd.length == 0
                ? "Нечетных элементов нет"
                : "Нечетные элементы: " + Arrays.toString(odd));
    }
}
