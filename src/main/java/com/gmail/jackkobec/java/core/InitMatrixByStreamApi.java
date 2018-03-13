package com.gmail.jackkobec.java.core;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Author Jack <jackkobec>
 */
public class InitMatrixByStreamApi {
    public static final int ROWS_COUNT = 5; // Matrix rows number
    public static final int COLUMN_COUNT = 2; // Matrix columns number

    public static void main(String[] args) {

        Integer[][] matrixFromStreamApi = initMatrixInStream(ROWS_COUNT, COLUMN_COUNT);
        printMatrix(matrixFromStreamApi);
    }

    /**
     * Init matrix by random int values with border 777
     *
     * @param rowsCount    - Matrix rows number
     * @param columnsCount - Matrix columns number
     * @return Integer[][]
     */
    public static Integer[][] initMatrixInStream(int rowsCount, int columnsCount) {
        return IntStream.range(0, rowsCount)
                .mapToObj(rowArray -> IntStream.range(0, columnsCount)
                        .mapToObj(columnArrayElement -> new Random().nextInt(777)).toArray(Integer[]::new)
                )
                .toArray(Integer[][]::new);
    }

    /**
     * Prints matrix.
     *
     * @param matrix
     */
    public static void printMatrix(Integer[][] matrix) {
        Arrays.stream(matrix)
                .map(array -> Arrays.toString(array) + "\n")
                .forEach(System.out::println);
    }
}
