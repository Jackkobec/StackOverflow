package com.gmail.jackkobec.java.core.string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jack <J@ck>
 * https://stackoverflow.com/questions/49263227/problems-returning-the-length-of-the-longest-string-among-the-values-of-input-in/49266036#49266036
 */
public class LongestStringFromHashMapValues {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<String, String>() {{
            put("key1", "ss");
            put("key2", "sss");
            put("key3", "ssss");
            put("key4", "sssssssssssssssssssssssssss");
        }};

        System.out.println(getLongestStringFromMapValues(stringMap));
    }

    /**
     * Takes a HashMap<String, String> and returns the longest String among the HashMap values.
     */
    /**
     * Returns longest string from the map values.
     *
     * @param stringMap - input map
     * @return String
     */
    public static String getLongestStringFromMapValues(Map<String, String> stringMap) {

        return stringMap.values().stream().max(Comparator.comparingInt(String::length)).get();
    }
}
