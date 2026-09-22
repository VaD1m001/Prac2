package ru.mirea.it.java.Prac2_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        // Формируем колоду
        List<String> deck = new ArrayList<>();
        for (String s : suits)
            for (String r : ranks)
                deck.add(r + s);

        Collections.shuffle(deck);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n <= 0 || n * 5 > deck.size()) {
            System.out.println("Некорректное число игроков. Максимум: " + (deck.size() / 5));
            return;
        }

        int card = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.get(card++) + " ");
            }
            System.out.println("\n"); // пустая строка между игроками
        }
    }
}