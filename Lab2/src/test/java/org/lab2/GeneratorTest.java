
package org.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratorTest {
    @Test
    public void testGenerateRandomNumber() {
        int randomNumber = Generator.generateRandomNumber();
        Assertions.assertTrue(randomNumber >= -10 && randomNumber <= 10, "The random number should be between -10 and 10");
    }
}
