package pr2.task08;

import java.util.Arrays;

public class Main {
    public static void reverse(String[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            String tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        String[] a = {"один", "два", "три", "четыре", "пять"};
        System.out.println("Исходный: " + Arrays.toString(a));
        reverse(a);
        System.out.println("Обратный: " + Arrays.toString(a));
    }
}
