package tarasevich.nikolai.interview.algo.sorting.selection;

import tarasevich.nikolai.interview.algo.sorting.utils.SortingHelper;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = SortingHelper.generateIntArray();
        System.out.println("Before " + Arrays.toString(arr));
        int[] result = SelectionSort.sort(arr);
        System.out.println("After " + Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        return sort(arr, 0);
    }

    public static int[] sort(int[] arr, int pos) {
        if (pos < arr.length) {
            int minPos = pos + min(Arrays.copyOfRange(arr, pos, arr.length));
            if (pos != minPos) {
                swap(arr, pos, minPos);
            }
            pos++;
            return sort(arr, pos);
        } else {
            return arr;
        }
    }

    private static void swap(int[] arr, int pos, int minPos) {
        int temp = arr[pos];
        arr[pos] = arr[minPos];
        arr[minPos] = temp;
    }

    private static int min(int[] arr) {
        int pos = 0;
        int min = arr[pos];
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    pos = i;
                    min = arr[i];
                }
            }
        }
        return pos;
    }
}
