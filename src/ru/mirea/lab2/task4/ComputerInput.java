package pr2.task04;

// Источник данных о компьютерах для заполнения магазина
public interface ComputerInput {
    // Возвращает null, если данных больше нет
    Computer readComputer();

    String readQuery();
}
