package ru.mirea.it.java.Prac2_4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить ПК  2. Удалить ПК  3. Найти ПК  4. Показать всё  0. Выход");
            System.out.print("Выбор: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Название: ");
                    String name = sc.nextLine();
                    System.out.print("RAM (ГБ): ");
                    int ram = Integer.parseInt(sc.nextLine());
                    System.out.print("Цена: ");
                    int price = Integer.parseInt(sc.nextLine());
                    shop.add(new Computer(name, ram, price));
                    break;
                case "2":
                    System.out.print("Имя для удаления: ");
                    System.out.println(shop.remove(sc.nextLine()) ? "Удалено." : "Не найдено.");
                    break;
                case "3":
                    System.out.print("Имя для поиска: ");
                    Computer c = shop.find(sc.nextLine());
                    System.out.println(c == null ? "Не найдено." : c);
                    break;
                case "4":
                    shop.printAll();
                    break;
                case "0":
                    sc.close();
                    return;
                default:
                    System.out.println("Неверный ввод.");
            }
        }
    }
}