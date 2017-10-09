package tarasevich.nikolai.interview.ds.array;

/**
 * @author nikolai.tarasevich
 */
public class Rotate {

    /**
     * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
     */
    public int[] rotateSystemArrayCopy(int[] arr, int n, int d) {
        int[] result = new int[arr.length];

        System.arraycopy(arr, 0, result, arr.length - d, d);
        System.arraycopy(arr, d, result, 0, arr.length - d);

        return result;
    }

    public int[] rotateOneByOne(int[] arr, int n, int d) {
        for (int i = 0; i < d; i++) {
            rotateOnOne(arr, n);
        }
        return arr;
    }

    private void rotateOnOne(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = 6;
        Rotate rotate = new Rotate();
        //int[] result = rotate.rotateSystemArrayCopy(arr, n, d);
        int[] result = rotate.rotateOneByOne(arr, n, d);
    }
}
