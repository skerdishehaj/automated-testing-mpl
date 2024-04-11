package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayExampleTest {
    @Test
    public void testRemoveDuplicates() {
        String[] input1 = {"Software", "Testing", "Course", "Software"};
        String[] expectedResult1 = {"Software", "Testing", "Course"};
        Assertions.assertArrayEquals(expectedResult1, ArrayExample.removeDuplicates(input1));

        String[] input2 = {"Software", "Testing", "Course"};
        String[] expectedResult2 = {"Software", "Testing", "Course"};
        Assertions.assertArrayEquals(expectedResult2, ArrayExample.removeDuplicates(input2));

        String[] input3 = {"Software", "Software", "Software", "Software"};
        String[] expectedResult3 = {"Software"};
        Assertions.assertArrayEquals(expectedResult3, ArrayExample.removeDuplicates(input3));

        String[] input4 = {};
        String[] expectedResult4 ={};
        Assertions.assertArrayEquals(expectedResult4, ArrayExample.removeDuplicates(input4));

        String[] input5 ={"Software", null, "Testing", "Course"};
        String[] expectedResult5 = new String[]{"Software", null, "Testing", "Course"};
        Assertions.assertArrayEquals(expectedResult5, ArrayExample.removeDuplicates(input5));

        String[] input6 ={"Software", "", "Testing", "", ""};
        String[] expectedResult6 = new String[]{"Software", "", "Testing"};
        Assertions.assertArrayEquals(expectedResult6, ArrayExample.removeDuplicates(input6));
    }
}
