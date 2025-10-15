package utils;

public class NumberUtils {
/**
 * finds the first pos of a traget number in an array
 * @param arr the array to search
 * @param target the number to find
 * @return the index of the first pos, or -1 if not found
**/
    public static int getPos(int[] arr, int target) {
        for (int i =0; i < arr.length; i++) {
            if (arr [i] == target) return i;
            }
        return -1;
    }
}
