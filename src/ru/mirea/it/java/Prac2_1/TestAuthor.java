package ru.mirea.it.java.Prac2_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Иван Петров", "ivan@mail.ru", 'm');
        System.out.println(a);
        a.setEmail("new@mail.ru");
        System.out.println("После смены почты: " + a.getEmail());
        System.out.println("Пол: " + a.getGender());
    }
}