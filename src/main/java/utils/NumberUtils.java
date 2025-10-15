package utils;

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
     * @param arr the array to search
     * @param target the number to find
     * @return the index of the last pos, or -1 if not found
     */

    public static int getLastPos(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) return i;
        }
        return -1;
    }


    public static boolean isIdentical(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

