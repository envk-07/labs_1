package ru.mirea.lab3.format1;

import ru.mirea.lab3.format3.Employee;

public class Report {
    public static void generateReport(Employee[] employees) {
        String line = "-".repeat(46);
        System.out.println(line);
        System.out.printf("%-3s %-28s %13s%n", "N", "Сотрудник", "Зарплата");
        System.out.println(line);
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            System.out.printf("%-3d %-28s %,13.2f%n", i + 1, e.getFullname(), e.getSalary());
            total += e.getSalary();
        }
        System.out.println(line);
        System.out.printf("%-32s %,13.2f%n", "Итого:", total);
        System.out.printf("%-32s %,13.2f%n", "Средняя:", total / employees.length);
    }

    public static void main(String[] args) {
        Employee[] staff = {
            new Employee("Иванов Иван Иванович", 85000),
            new Employee("Петрова Анна Сергеевна", 112500.5),
            new Employee("Сидоров Петр", 64320.75),
            new Employee("Кузнецова Мария Олеговна", 1250000)
        };
        generateReport(staff);
    }
}
