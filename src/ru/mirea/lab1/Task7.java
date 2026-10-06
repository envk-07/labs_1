package ru.mirea.lab1;

public class Task7 {

    public static long Factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("проверка");
        int num1 = 5;
        System.out.println("Факториал " + num1 + " = " + Factorial(num1));
        int num2 = 0;
        System.out.println("Факториал " + num2 + " = " + Factorial(num2));
    }
}