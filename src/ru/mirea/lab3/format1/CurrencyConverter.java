package ru.mirea.lab3.format1;

import java.util.Locale;
import java.util.Map;

public class CurrencyConverter {
    // Курс: сколько рублей стоит единица валюты
    private static final Map<String, Double> RATES = Map.of(
            "RUB", 1.0,
            "USD", 92.5,
            "EUR", 100.3,
            "CNY", 12.8);

    public static boolean isSupported(String code) {
        return RATES.containsKey(code);
    }

    public static String[] currencies() {
        return new String[] {"RUB", "USD", "EUR", "CNY"};
    }

    public double convert(double amount, String from, String to) {
        if (!isSupported(from) || !isSupported(to)) {
            throw new IllegalArgumentException("Неизвестная валюта: " + from + " или " + to);
        }
        return amount * RATES.get(from) / RATES.get(to);
    }

    public static String format(double amount, String code) {
        return String.format(Locale.US, "%,.2f %s", amount, code);
    }
}
