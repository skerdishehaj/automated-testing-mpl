package org.example;

import java.util.Arrays;

public class ArrayExample {

 /*   public static String[] removeDuplicates(String[] array) {
        int length = array.length;

        for(int i = 0; i < length; ++i) {
            for(int j = i + 1; j < length; ++j) {
                if (array[i] != null && array[i].equals(array[j])) {
                    array[j] = array[length - 1];
                    array[length - 1] = null;
                    length--;
                    j--;
                }
            }
        }

        return (String[])Arrays.copyOf(array, length);
    }

  */

    public static String[] removeDuplicates(String[] array) {
        int length = array.length;

        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (array[i] != null && array[i].equals(array[j])) {
                    while (j < length && array[i].equals(array[length - 1])) {
                        length--;
                    }
                    if (j < length) {
                        array[j] = array[length - 1];
                        array[length - 1] = null;
                        length--;
                    }
                }
            }
        }

        return (String[]) Arrays.copyOf(array, length);
    }
}
