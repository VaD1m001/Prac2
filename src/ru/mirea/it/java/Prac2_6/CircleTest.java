package ru.mirea.it.java.Prac2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);

        System.out.printf("c1: S=%.2f, L=%.2f%n", c1.getArea(), c1.getLength());
        System.out.printf("c2: S=%.2f, L=%.2f%n", c2.getArea(), c2.getLength());
        System.out.println("c2 больше c1? " + c2.isBigger(c1));
        System.out.println("c1 больше c2? " + c1.isBigger(c2));
    }
}