package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public double divide(int y) {
        return y / x;
    }

    public double sumAllOperation(int y) {

        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator casio = new Calculator();
        System.out.println(casio.sum(10));
        System.out.println(casio.minus(5));
        System.out.println(casio.divide(5));
        System.out.println(casio.sumAllOperation(11));
    }
}
