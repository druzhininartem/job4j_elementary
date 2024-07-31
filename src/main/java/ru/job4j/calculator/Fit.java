package ru.job4j.calculator;

public class Fit {
    private static final double COEFFICIENT = 1.15;
    private static final int MAN_HEIGHT_DIFF = 100;
    private static final int WOMAN_HEIGHT_DIFF = 110;

    public static double manWeight(short height) {
        return (height - MAN_HEIGHT_DIFF) * COEFFICIENT;
    }

    public static double womanWeight(short height) {
        return (height - WOMAN_HEIGHT_DIFF) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = Fit.manWeight(height);
        System.out.printf("Man %d cm is %.2f kg%n", height, man);
        double woman = Fit.womanWeight(height);
        System.out.printf("Woman %d cm is %.2f kg%n", height, woman);
    }
}

