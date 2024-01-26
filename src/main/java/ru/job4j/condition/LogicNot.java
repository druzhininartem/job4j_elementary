package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0 && num != 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num) && num != 0;
    }

    public static boolean notPositive(int num) {
        return !isPositive(num) && num != 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num) && num != 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num) && num != 0;
    }

    public static void main(String[] args) {
        boolean isEven = LogicNot.isEven(100);
        System.out.println(isEven);

        boolean isPositive = LogicNot.isPositive(10);
        System.out.println(isPositive);

        boolean notEven = LogicNot.notEven(101);
        System.out.println(notEven);

        boolean notPositive = LogicNot.notPositive(-10);
        System.out.println(notPositive);

        boolean notEvenAndPositive = LogicNot.notEvenAndPositive(7);
        System.out.println(notEvenAndPositive);

        boolean evenOrNotPositive = LogicNot.evenOrNotPositive(-10);
        System.out.println(evenOrNotPositive);
    }
}
