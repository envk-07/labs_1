package ru.mirea.lab3.format2;

public class Product {
    private final String name;
    private final double priceRub;

    public Product(String name, double priceRub) {
        this.name = name;
        this.priceRub = priceRub;
    }

    public String getName() {
        return name;
    }

    public double getPriceRub() {
        return priceRub;
    }
}
