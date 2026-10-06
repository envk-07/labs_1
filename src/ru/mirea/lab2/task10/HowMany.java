package pr2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст (конец ввода - Ctrl+D):");
        int count = 0;
        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        System.out.println("Количество слов: " + count);
    }
}
