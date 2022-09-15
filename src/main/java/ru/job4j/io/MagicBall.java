package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.print(question);
        String res;
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                res = "Да";
                break;
            case 1:
                res = "Нет";
                break;
            default:
                res = "Может быть";
                break;
        }
        System.out.println(question + " - " + res);
    }
}
