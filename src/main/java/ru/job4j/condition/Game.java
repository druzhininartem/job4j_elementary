package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
        if ("contra".equals(name)) {
            System.out.println("Start - contra");
        }
        if ("aladdin".equals(name)) {
            System.out.println("Start - aladdin");
        }
    }

    public static void main(String[] args) {
        Game.menu("super mario");
        Game.menu("tanks");
        Game.menu("tetris");
        Game.menu("contra");
        Game.menu("aladdin");
    }
}