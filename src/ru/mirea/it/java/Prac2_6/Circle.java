package ru.mirea.it.java.Prac2_6;

public class Circle {
    private double radius;

    public Circle(double radius) { this.radius = radius; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return Math.PI * radius * radius; }
    public double getLength() { return 2 * Math.PI * radius; }

    /** Возвращает true, если радиус этой окружности больше, чем у other */
    public boolean isBigger(Circle other) {
        return this.radius > other.radius;
    }

    @Override
    public String toString() { return "Circle{r=" + radius + '}'; }
}