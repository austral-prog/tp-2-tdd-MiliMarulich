package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        numbers = numbers.replace("\n", ",");

        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < 0) {
                throw new IllegalArgumentException("No se permiten números negativos");
            }
            sum += num;
        }

        return sum;
    }
}
