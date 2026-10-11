package ru.mirea.lab3.task02;

public class Circle implements Comparable<Circle> {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(radius, other.radius);
    }

    @Override
    public String toString() {
        return String.format("Circle[центр=%s, r=%.2f, длина=%.2f]", center, radius, getLength());
    }
}
