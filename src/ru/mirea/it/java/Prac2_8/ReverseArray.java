package ru.mirea.it.java.Prac2_8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"один", "два", "три", "четыре", "пять"};

        System.out.println("Исходный массив:");
        print(arr);

        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        System.out.println("\nПеревёрнутый массив:");
        print(reversed);
    }

    private static void print(String[] a) {
        for (String s : a) System.out.print(s + " ");
        System.out.println();
    }
}