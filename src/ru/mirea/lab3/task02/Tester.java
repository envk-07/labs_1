package ru.mirea.lab3.task02;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private final Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
    }

    public boolean add(Circle c) {
        if (count == circles.length) {
            return false;
        }
        circles[count++] = c;
        return true;
    }

    public Circle getMin() {
        Circle min = null;
        for (int i = 0; i < count; i++) {
            if (min == null || circles[i].compareTo(min) < 0) {
                min = circles[i];
            }
        }
        return min;
    }

    public Circle getMax() {
        Circle max = null;
        for (int i = 0; i < count; i++) {
            if (max == null || circles[i].compareTo(max) > 0) {
                max = circles[i];
            }
        }
        return max;
    }

    public void sort() {
        Arrays.sort(circles, 0, count);
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println("  " + circles[i]);
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Tester t = new Tester(5);
        for (int i = 0; i < 5; i++) {
            Point p = new Point(rnd.nextInt(21) - 10, Math.random() * 20 - 10);
            t.add(new Circle(p, 1 + rnd.nextDouble() * 9));
        }
        System.out.println("Окружности:");
        t.print();
        System.out.println("Самая маленькая: " + t.getMin());
        System.out.println("Самая большая:   " + t.getMax());
        t.sort();
        System.out.println("После упорядочивания по радиусу:");
        t.print();
    }
}
