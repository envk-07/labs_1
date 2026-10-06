package pr2.task07;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private final Book[] books;
    private int count;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
    }

    // Композиция: книга создается и хранится только внутри полки
    public boolean addBook(String author, String title, int year) {
        if (count == books.length) {
            return false;
        }
        books[count++] = new Book(author, title, year);
        return true;
    }

    public int getCount() {
        return count;
    }

    public Book getLatest() {
        Book result = null;
        for (int i = 0; i < count; i++) {
            if (result == null || books[i].getYear() > result.getYear()) {
                result = books[i];
            }
        }
        return result;
    }

    public Book getEarliest() {
        Book result = null;
        for (int i = 0; i < count; i++) {
            if (result == null || books[i].getYear() < result.getYear()) {
                result = books[i];
            }
        }
        return result;
    }

    public void sortByYear() {
        Arrays.sort(books, 0, count, Comparator.comparingInt(Book::getYear));
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println("  " + books[i]);
        }
    }
}
