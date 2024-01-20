package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float expectedEuro = 2;
        float expectedDollar = 2;
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are " + euro + " euro." + " Test result : " + passedEuro);
        System.out.println("120 rubles are " + dollar + " dollar." + " Test result : " + passedDollar);
    }

}
