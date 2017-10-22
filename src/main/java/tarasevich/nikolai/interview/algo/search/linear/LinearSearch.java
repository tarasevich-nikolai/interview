package tarasevich.nikolai.interview.algo.search.linear;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

/**
 * @author nikolai.tarasevich
 */
public class LinearSearch {

    public static int search(int[] arr, int lookingFor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == lookingFor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = SearchHelper.generateIntArray();
        int lookingFor = arr[9];
        int result = search(arr, lookingFor);
        System.out.println(result);
    }
}
