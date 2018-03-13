package com.gmail.jackkobec.java.core.string;

/**
 * @Author Jack <jackkobec>
 */
public class StringConstructorFromCharArrayWithOffsetAndCount {
    public static void main(String args[]) {
        /**
         * String stringFromCharArrayWithOffsetAndCount = new String(chars, 2,3);
         This calls String constructor with next parameters:

         String(char value[], int offset, int count)
         2 - its mean offset from the string begins(count of chars)

         3 - int mean count of the chars for write in this created string(3 chars)

         Finally its mean 3 chars from array from the 3rd array element(skip 2)
         */
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String stringFromCharArrayWithOffsetAndCount = new String(chars, 2, 3);
        System.out.println(stringFromCharArrayWithOffsetAndCount);
    }
}
