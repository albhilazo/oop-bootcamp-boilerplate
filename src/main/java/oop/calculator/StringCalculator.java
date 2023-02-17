package oop.calculator;

import java.util.Arrays;

public class StringCalculator {

    public static final String DELIMITER = ",";

    public static Integer add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        return commaSeparatedSum(input);
    }

    private static Integer commaSeparatedSum(String input) {
        String[] splitInput = input.split(DELIMITER);
        return Arrays.stream(splitInput)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
