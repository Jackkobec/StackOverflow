package com.gmail.jackkobec.java.core.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Jack <J@ck>
 * https://stackoverflow.com/questions/49266832/integer-in-compareto
 */
public class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Create new list wit reverse order
        List<Integer> reverseList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseList);
    }
}
