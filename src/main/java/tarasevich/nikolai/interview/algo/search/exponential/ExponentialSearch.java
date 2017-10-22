package tarasevich.nikolai.interview.algo.search.exponential;

import tarasevich.nikolai.interview.algo.search.binary.BinarySearch;
import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class ExponentialSearch {

    public static int search(int[] arr, int lookingFor) {
        int start = 0;
        if (lookingFor == arr[start]) {
            return start;
        }

        start = 1;
        while(lookingFor >= arr[start] && start < arr.length) {
            start *= 2;
        }

        return start / 2 + BinarySearch.search(Arrays.copyOfRange(arr, start / 2, start), lookingFor);
    }

    public static void main(String[] args) {
        int[] arr = SearchHelper.generateSortedIntArray();
        int lookingFor = arr[5];
        int result = search(arr, lookingFor);
        System.out.println(result);
    }
}
