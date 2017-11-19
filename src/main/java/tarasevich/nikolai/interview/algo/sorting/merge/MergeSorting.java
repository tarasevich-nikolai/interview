package tarasevich.nikolai.interview.algo.sorting.merge;

import tarasevich.nikolai.interview.algo.sorting.selection.SelectionSort;
import tarasevich.nikolai.interview.algo.sorting.utils.SortingHelper;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class MergeSorting {

    public static void main(String[] args) {
        int[] arr = SortingHelper.generateIntArray();
        System.out.println("Before " + Arrays.toString(arr));
        MergeSorting.sort(arr, 0, arr.length);
        System.out.println("After " + Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int med = (high - low) / 2;
            System.out.println(low + " " + med + " " + high);
            sort(arr, low, med);
            sort(arr, low + 1, med);

            merge(arr, low, med + 1, high);
        }
    }

    private static void merge(int[] arr, int low, int med, int high) {
        int i = low;
        int j = med;
        int k = high;

        int[] result = new int[high - low];
        int nextCount = 0;

        if (high - low == 2) {
            if (arr[low] < arr[low + 1]) {
                result[0] = arr[low];
                result[1] = arr[low + 1];
            } else {
                result[1] = arr[low];
                result[0] = arr[low + 1];
            }
        } else {
            for (int next = 0; next < result.length; next++) {
                if (i == med) {
                    result[nextCount] = arr[j];
                    j++;
                } else if (j == high) {
                    result[nextCount] = arr[i];
                    i++;
                } else if (arr[i] < arr[j]) {
                    result[nextCount] = arr[i];
                    i++;
                } else {
                    result[nextCount] = arr[j];
                    j++;
                }
                nextCount++;
            }
        }


        System.arraycopy(result, 0, arr, low, high - low);

        System.out.println();
    }


    private static void swap(int[] arr, int pos, int minPos) {
        int temp = arr[pos];
        arr[pos] = arr[minPos];
        arr[minPos] = temp;
    }

}
