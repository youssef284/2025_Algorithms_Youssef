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

        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    /**
     * decides if 2 arrays contain same elements even if it's not the same order
     * @param a first arrayy
     * @param b second array
     * @return true if both contain the same elements, false if not
     */
    public static boolean isEqual(int[] a, int[] b) {

        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

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


    /**
     * if array a is a subset o array b
     * @param A first array
     * @param B second array
     * @return true if a is a subset of b, false in not
     */
    public static boolean isSubset(int[] A, int[] B) {
        //  Null and empty checks
        if (A == null || B == null) return false;
        if (A.length == 0 || B.length == 0) return false;

        //  If identical size and contain same elements = not a subset
        if (A.length == B.length) {
            int[] copyA = Arrays.copyOf(A, A.length);
            int[] copyB = Arrays.copyOf(B, B.length);
            Arrays.sort(copyA);
            Arrays.sort(copyB);
            boolean same = true;
            for (int i = 0; i < copyA.length; i++) {
                if (copyA[i] != copyB[i]) {
                    same = false;
                    break;
                }
            }
            if (same) return false;
        }

        // subset logic
        for (int valueA : A) {
            boolean found = false;
            for (int valueB : B) {
                if (valueA == valueB) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }

        return true;
    }

    /**
     * Finds the largest number in an array.
     * @param arr the array to search
     * @return the maximum number in the array
     */

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}


