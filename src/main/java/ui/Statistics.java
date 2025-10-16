package ui;

import utils.NumberUtils;
import utils.DataGenerator;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        int[] hardcoded = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        int[] randomArray = DataGenerator.getRandomArray();

        System.out.println("Hardcoded array: " + Arrays.toString(hardcoded));
        System.out.println("Random array: " + Arrays.toString(randomArray));

        int max = NumberUtils.getMax(randomArray);
        System.out.println("Max value in random array: " + max);
        System.out.println("First position of max: " + NumberUtils.getPos(randomArray, max));
        System.out.println("Last position of max: " + NumberUtils.getLastPos(randomArray, max));

        System.out.println("Identical? " + NumberUtils.isIdentical(hardcoded, randomArray));
        System.out.println("Equal (regardless of order)? " + NumberUtils.isEqual(hardcoded, randomArray));
        System.out.println("Hardcoded subset of random? " + NumberUtils.isSubset(hardcoded, randomArray));
    }
}
