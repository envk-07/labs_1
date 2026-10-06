import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sumWhile = 0;
        int i = 0;
        while (i < n) {
            sumWhile += array[i];
            i++;
        }
        int min = array[0];
        int max = array[0];
        for (int k = 1; k < n; k++) {
            if (array[k] < min) {
                min = array[k];
            }
            if (array[k] > max) {
                max = array[k];
            }
        }

        // Вывод результатов
        System.out.println("Сумма элементов (while): " + sumWhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        scanner.close();
    }
}