package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Artem";
        names[1] = "Maria";
        names[2] = "Arina";
        names[3] = "Alexandra";
        System.out.println("Размер short[] ages равен: " + ages.length);
        System.out.println("Размер String[] surnames равен: " + surnames.length);
        System.out.println("Размер float[] prices равен: " + prices.length);
        System.out.println("-------------------------------");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
