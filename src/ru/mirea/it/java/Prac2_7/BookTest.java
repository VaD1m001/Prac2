package ru.mirea.it.java.Prac2_7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);
        shelf.add(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.add(new Book("Толстой", "Война и мир", 1869));
        shelf.add(new Book("Достоевский", "Преступление и наказание", 1866));
        shelf.add(new Book("Булгаков", "Мастер и Маргарита", 1967));

        System.out.println("=== Полка ===");
        shelf.printAll();

        System.out.println("\nСамая ранняя: " + shelf.getEarliest());
        System.out.println("Самая поздняя: " + shelf.getLatest());

        System.out.println("\n=== После сортировки по году ===");
        shelf.sortByYear();
        shelf.printAll();
    }
}