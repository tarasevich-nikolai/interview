package tarasevich.nikolai.interview.algo.sorting.bubble;

import tarasevich.nikolai.interview.algo.sorting.selection.SelectionSort;
import tarasevich.nikolai.interview.algo.sorting.utils.SortingHelper;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class BubbleSorting {

    public static void main(String[] args) {
        int[] arr = SortingHelper.generateIntArray();
        System.out.println("Before " + Arrays.toString(arr));
        int[] result = SelectionSort.sort(arr);
        System.out.println("After " + Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                return arr;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int pos, int minPos) {
        int temp = arr[pos];
        arr[pos] = arr[minPos];
        arr[minPos] = temp;
    }
}
