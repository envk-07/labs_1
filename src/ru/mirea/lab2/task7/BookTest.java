package pr2.task07;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("А. С. Пушкин", "Евгений Онегин", 1833);
        System.out.println(book);
        book.setYear(1832);
        System.out.println("После setYear: " + book.getTitle() + ", " + book.getYear());

        Bookshelf shelf = new Bookshelf(10);
        shelf.addBook("Л. Н. Толстой", "Война и мир", 1869);
        shelf.addBook("Ф. М. Достоевский", "Преступление и наказание", 1866);
        shelf.addBook("М. А. Булгаков", "Мастер и Маргарита", 1967);
        shelf.addBook("А. С. Грибоедов", "Горе от ума", 1825);
        System.out.println("Книг на полке: " + shelf.getCount());
        shelf.print();
        System.out.println("Самая поздняя: " + shelf.getLatest());
        System.out.println("Самая ранняя: " + shelf.getEarliest());
        shelf.sortByYear();
        System.out.println("По возрастанию года:");
        shelf.print();
    }
}
