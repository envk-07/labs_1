package ru.mirea.lab3.format1;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter conv = new CurrencyConverter();
        double amount = 1500;
        for (String from : new String[] {"RUB", "USD"}) {
            for (String to : CurrencyConverter.currencies()) {
                if (!from.equals(to)) {
                    System.out.printf("%15s = %15s%n",
                            CurrencyConverter.format(amount, from),
                            CurrencyConverter.format(conv.convert(amount, from, to), to));
                }
            }
        }
    }
}
