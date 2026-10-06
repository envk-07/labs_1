package pr2.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<Computer> computers = new ArrayList<>();

    public void add(Computer c) {
        computers.add(c);
    }

    public boolean remove(Computer c) {
        return computers.remove(c);
    }

    public List<Computer> find(String query) {
        List<Computer> result = new ArrayList<>();
        for (Computer c : computers) {
            if (c.getBrand().equalsIgnoreCase(query) || c.getModel().equalsIgnoreCase(query)) {
                result.add(c);
            }
        }
        return result;
    }

    public void fill(ComputerInput input) {
        Computer c;
        while ((c = input.readComputer()) != null) {
            add(c);
        }
    }

    public void print() {
        System.out.println("Компьютеры в магазине:");
        for (Computer c : computers) {
            System.out.println("  " + c);
        }
    }

    public static void main(String[] args) {
        ComputerInput input = new ConsoleComputerInput(new Scanner(System.in));
        Shop shop = new Shop();
        shop.fill(input);
        shop.print();

        String query = input.readQuery();
        if (query != null) {
            List<Computer> found = shop.find(query);
            System.out.println(found.isEmpty() ? "Ничего не найдено" : "Найдено (покупаем): " + found);
            for (Computer c : found) {
                shop.remove(c);
            }
            shop.print();
        }
    }
}
