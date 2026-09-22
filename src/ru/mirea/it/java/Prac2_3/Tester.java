package ru.mirea.it.java.Prac2_3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void add(Circle c) {
        if (count < circles.length) circles[count++] = c;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester t = new Tester(3);
        t.add(new Circle(new Point(0, 0), 5));
        t.add(new Circle(new Point(3, 4), 2.5));
        t.add(new Circle(new Point(-1, 7), 1));
        t.printAll();
    }
}