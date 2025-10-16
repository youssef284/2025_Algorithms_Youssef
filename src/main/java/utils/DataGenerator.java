package utils;

import java.util.Random;

public class DataGenerator {
    private static Random randomGenerator = new Random();

    /**
     * Generates an array of random integers.
     *
     * @return an array of random numbers
     */
    public static int[] getRandomArray() {
        int numElements = 10;
        int[] values = new int[numElements];

        for (int i = 0; i < values.length; i++) {
            values[i] = randomGenerator.nextInt(100);
        }

        return values;
    }
}
