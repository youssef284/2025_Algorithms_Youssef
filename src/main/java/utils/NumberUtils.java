package utils;

import java.util.Arrays;

public class NumberUtils {
    /**
     * finds the first pos of a traget number in an array
     *
     * @param arr    the array to search
     * @param target the number to find
     * @return the index of the first pos, or -1 if not found
     **/
    public static int getPos(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    /**
     * Finds the last position of a target number in an array.
     *
     * @param arr    the array to search
     * @param target the number to find
     * @return the index of the last pos, or -1 if not found
     */

    public static int getLastPos(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    /**
     * Decides if two arrays are identical
     *
     * @param a first array
     * @param b second array
     * @return true if identical, false otherwise
     */

    public static boolean isIdentical(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);

        Arrays.sort(copyA);
        Arrays.sort(copyB);

        for (int i = 0; i < copyA.length; i++) {
            if (copyA[i] != copyB[i]) {
                return false;
            }
        }

        return true;
    }
}


