package ru.mirea.it.java.Prac2_4;

public class Computer {
    private String name;
    private int ram;   // ГБ
    private int price; // руб.

    public Computer(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() { return name; }
    public int getRam() { return ram; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (RAM: " + ram + " ГБ, " + price + " руб.)";
    }
}