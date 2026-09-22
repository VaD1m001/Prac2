package ru.mirea.it.java.Prac2_5;

public class ПитомникСобак {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Шарик", 3);
        dogs[1] = new Dog("Бобик", 5);
        dogs[2] = new Dog("Рекс", 2);

        for (Dog d : dogs) {
            System.out.println(d);
        }
    }
}