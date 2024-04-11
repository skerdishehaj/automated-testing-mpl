package org.lab2;

import java.util.Random;

public class Generator {
    private static Random random = new Random();

    public static int generateRandomNumber() {
        return random.nextInt(21) - 10; // Generates a random number between -10 and 10
    }
}


