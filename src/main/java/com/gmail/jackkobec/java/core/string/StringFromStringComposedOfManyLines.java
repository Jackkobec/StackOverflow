package com.gmail.jackkobec.java.core.string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;

/**
 * @Author Jack <J@ck>
 * https://stackoverflow.com/questions/49264343/java-get-substring-or-split-from-multiline-string
 */
public class StringFromStringComposedOfManyLines {
    public static void main(String[] args) {
        String manyLinesString =
                "Date: May 12, 20003\n" +
                        "ID: 54076\n" +
                        "Content: Test\n" +
                        "filename: Testing.fileextension\n" +
                        "folder: Test Folder\n" +
                        "endDate: May 13, 2003\n";
        System.out.println(manyLinesString);

        // Replace all \n \t \r occurrences to "" and gets one line string
        String inLineString = manyLinesString.replaceAll("\\n|\\t||\\r", "");
        System.out.println(inLineString);
    }
}
