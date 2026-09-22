package ru.mirea.it.java.Prac2_2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.5, 2.5);
        System.out.println(b1);
        b1.move(1.0, -0.5);
        System.out.println("После move: " + b1);

        Ball b2 = new Ball();
        b2.setXY(10, 20);
        System.out.println("b2: " + b2);
    }
}