package ru.job4j.array;

import java.util.StringJoiner;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringJoiner result = new StringJoiner("");
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.add(String.valueOf(symbol));
                if (counter > 1) {
                    result.add(String.valueOf(counter));
                }
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result.add(String.valueOf(symbol));
        if (counter > 1) {
            result.add(String.valueOf(counter));
        }
        return result.toString();
    }
}
