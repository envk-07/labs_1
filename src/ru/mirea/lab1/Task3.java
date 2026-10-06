package ru.mirea.lab1;


public class Task3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        // Вывод результата на экран
        System.out.println("Элементы массива" +  );
        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое:", average);
    }
}