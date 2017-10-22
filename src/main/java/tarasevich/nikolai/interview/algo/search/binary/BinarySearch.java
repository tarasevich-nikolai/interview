package tarasevich.nikolai.interview.algo.search.binary;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class BinarySearch {

    public static int search(int[] arr, int lookingFor) {
        return search(arr, lookingFor, 0, arr.length);
    }

    private static int search(int[] arr, int lookingFor, int start, int end) {
        int middleIndex = (start + end - 1) / 2;
        int middleElem = arr[middleIndex];
        if (lookingFor == middleElem) {
            return middleIndex;
        }
        if (start == end || middleIndex == 0) {
            return -1;
        }
        if (lookingFor > middleElem) {
            return search(arr, lookingFor, middleIndex + 1, end);
        }
        if (lookingFor < middleElem ) {
            return search(arr, lookingFor, 0, middleIndex - 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = SearchHelper.generateSortedIntArray();
        int lookingFor = arr[7];
        int result = search(arr, lookingFor);
        System.out.println(result);
    }
}
