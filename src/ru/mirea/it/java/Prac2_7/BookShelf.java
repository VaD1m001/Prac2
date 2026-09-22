package ru.mirea.it.java.Prac2_7;

public class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void add(Book b) {
        if (count < books.length) books[count++] = b;
    }

    public Book getEarliest() {
        if (count == 0) return null;
        Book min = books[0];
        for (int i = 1; i < count; i++)
            if (books[i].getYear() < min.getYear()) min = books[i];
        return min;
    }

    public Book getLatest() {
        if (count == 0) return null;
        Book max = books[0];
        for (int i = 1; i < count; i++)
            if (books[i].getYear() > max.getYear()) max = books[i];
        return max;
    }

    /** Сортировка по году издания (по возрастанию) */
    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) System.out.println(books[i]);
    }
}