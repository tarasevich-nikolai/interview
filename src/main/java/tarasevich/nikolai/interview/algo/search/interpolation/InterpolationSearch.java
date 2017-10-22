package tarasevich.nikolai.interview.algo.search.interpolation;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

/**
 * @author nikolai.tarasevich
 */
public class InterpolationSearch {

    public static int search(int[] arr, int lookingFor) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi && lookingFor >= arr[lo] && lookingFor <= arr[hi]) {
            if (arr[lo] == lookingFor) {
                return lo;
            }

            lo += ((lookingFor - arr[lo]) * (hi - lo)) / (arr[hi] - arr[lo]);
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
