package ru.mirea.lab3.format2;

import java.util.Scanner;
import ru.mirea.lab3.format1.CurrencyConverter;

public class Shop {
    private static final Product[] PRODUCTS = {
        new Product("Ноутбук", 75990),
        new Product("Мышь", 1290.5),
        new Product("Клавиатура", 3499),
        new Product("Монитор", 18990)
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter conv = new CurrencyConverter();

        System.out.println("Товары:");
        for (int i = 0; i < PRODUCTS.length; i++) {
            System.out.printf("%2d. %-12s %12.2f RUB%n", i + 1, PRODUCTS[i].getName(), PRODUCTS[i].getPriceRub());
        }

        System.out.print("Номер товара: ");
        int idx = sc.nextInt() - 1;
        if (idx < 0 || idx >= PRODUCTS.length) {
            System.out.println("Нет такого товара");
            return;
        }
        System.out.print("Количество: ");
        int qty = sc.nextInt();
        System.out.print("Валюта оплаты (" + String.join("/", CurrencyConverter.currencies()) + "): ");
        String cur = sc.next().toUpperCase();
        if (!CurrencyConverter.isSupported(cur)) {
            System.out.println("Валюта не поддерживается");
            return;
        }

        Product p = PRODUCTS[idx];
        double totalRub = p.getPriceRub() * qty;
        double total = conv.convert(totalRub, "RUB", cur);
        System.out.printf("%s x %d = %s (%s)%n", p.getName(), qty,
                CurrencyConverter.format(total, cur), CurrencyConverter.format(totalRub, "RUB"));
    }
}
