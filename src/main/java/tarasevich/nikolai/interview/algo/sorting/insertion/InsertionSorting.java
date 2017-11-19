package tarasevich.nikolai.interview.algo.sorting.insertion;

import tarasevich.nikolai.interview.algo.sorting.selection.SelectionSort;
import tarasevich.nikolai.interview.algo.sorting.utils.SortingHelper;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class InsertionSorting {

    public static void main(String[] args) {
        int[] arr = SortingHelper.generateIntArray();
        System.out.println("Before " + Arrays.toString(arr));
        int[] result = InsertionSorting.sort(arr);
        System.out.println("After " + Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i ; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
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
