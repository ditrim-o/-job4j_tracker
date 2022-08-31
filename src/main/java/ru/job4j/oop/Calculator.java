package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public double divide(int y) {
        return y / x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int sum = Calculator.sum(10);
        System.out.println(sum);
        int minus = Calculator.minus(3);
        System.out.println(minus);
        Calculator devider = new Calculator();
        double divide = devider.divide(10);
        System.out.println(divide);
        Calculator summator = new Calculator();
        double sumAll = summator.sumAllOperation(12);
        System.out.println(sumAll);
    }
}
