package tarasevich.nikolai.interview.ds.array;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class Rotate {

    /**
     * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
     */
    public int[] rotate1(int[] arr, int n, int d) {
        int[] result = new int[arr.length];

        System.arraycopy(arr, 0, result, arr.length - d, d);
        System.arraycopy(arr, d, result, 0, arr.length - d);

        return result;
    }

    public int[] rotate2(int[] arr, int n, int d) {
        for (int i )
    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = 6;
        Rotate rotate = new Rotate();
        int[] result = rotate.rotate1(arr, n, d);
    }
}
