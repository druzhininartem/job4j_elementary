package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < Math.min(word.length, prefix.length); i++) {
            if (word[i] != prefix[i]) {
                return false;
            }
        }
        return result;
    }
}
