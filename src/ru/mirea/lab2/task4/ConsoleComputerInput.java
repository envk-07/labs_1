package pr2.task04;

import java.util.Scanner;

public class ConsoleComputerInput implements ComputerInput {
    private final Scanner sc;

    public ConsoleComputerInput(Scanner sc) {
        this.sc = sc;
    }

    private String readLine(String prompt) {
        System.out.print(prompt);
        return sc.hasNextLine() ? sc.nextLine().trim() : null;
    }

    @Override
    public Computer readComputer() {
        String brand = readLine("Марка (пустая строка - конец ввода): ");
        if (brand == null || brand.isEmpty()) {
            return null;
        }
        String model = readLine("Модель: ");
        while (true) {
            String s = readLine("Цена: ");
            if (s == null) {
                return null;
            }
            try {
                return new Computer(brand, model, Double.parseDouble(s));
            } catch (NumberFormatException e) {
                System.out.println("Нужно число");
            }
        }
    }

    @Override
    public String readQuery() {
        return readLine("Что ищем (марка или модель): ");
    }
}
