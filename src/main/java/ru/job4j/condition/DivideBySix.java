package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0 && number % 2 == 0) {
            result = "The number divides by 6.";
        } else if (number % 3 == 0) {
            result = "The number divides by 3, but it isn't the even number.";
        } else if (number % 2 == 0) {
            result = "The number doesn't divide by 3, but it is the even number.";
        } else {
            result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(24));
        System.out.println(checkNumber(9));
        System.out.println(checkNumber(14));
        System.out.println(checkNumber(25));
    }
}
