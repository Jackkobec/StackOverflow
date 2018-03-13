package com.gmail.jackkobec.java.core.misc;

import java.util.HashMap;

/**
 * @Author Jack <e.kobets>
 * https://stackoverflow.com/questions/49264758/returns-the-minimum-result-of-taking-the-tangent-of-each-value-from-the-input-wh/49265209#49265209
 */
public class InplementTask {

    /**
     * Write a public static method named q3 that takes a HashMap of type String to Integer and returns a double.
     * This method returns the minimum result (do not return the original value)
     * of taking the tangent of each value from the input while considering only negative numbers from the inputs.
     */
    public static double q3(HashMap<String, Integer> numbers) {
        double max = Integer.MAX_VALUE;
        for (int value : numbers.values()) {
            if (Math.tan(value) > max && value < 0) {
                max = Math.tan(value);
            }
        }
        System.out.println(max);
        return max;
    }

    /**
     * Write a public static method named q3 that takes a HashMap of type String to Integer and returns a double.
     * This method returns the minimum result (do not return the original value)
     * of taking the tangent of each value from the input while considering only negative numbers from the inputs.
     */
    public static double q3OnStreamApi(HashMap<String, Integer> numbers) {
        final Double max = (double) Integer.MAX_VALUE;

        return numbers.values().stream()
                .filter(value -> !(Math.tan(value) > max && value < 0))
                .max(Integer::compareTo).orElseGet(max::intValue)
                .doubleValue();
    }

}
