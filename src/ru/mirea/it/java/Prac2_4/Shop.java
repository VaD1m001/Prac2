package ru.mirea.it.java.Prac2_4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void add(Computer c) { computers.add(c); }

    public boolean remove(String name) {
        return computers.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    public Computer find(String name) {
        for (Computer c : computers) {
            if (c.getName().equalsIgnoreCase(name)) return c;
        }
        return null;
    }

    public void printAll() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
        } else {
            computers.forEach(System.out::println);
        }
    }
}