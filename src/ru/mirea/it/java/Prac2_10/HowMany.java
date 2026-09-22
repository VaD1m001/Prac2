package ru.mirea.it.java.Prac2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку (слова разделены пробелами):");
        String line = sc.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("Слов: 0");
        } else {
            String[] words = line.split("\\s+");
            System.out.println("Слов: " + words.length);
        }
        sc.close();
    }
}