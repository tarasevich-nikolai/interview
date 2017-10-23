package tarasevich.nikolai.interview.algo.search.recursive_linear;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

public class RecursiveLinearSearch {

    public static int search(int[] arr, int lookingFor) {
        return linearSearch(arr, lookingFor, 0);
    }

    private static int linearSearch(int[] arr, int lookingFor, int index) {
        if (arr[index] == lookingFor) {
            return index;
        }
        if (index == arr.length) {
            return -1;
        }
        return linearSearch(arr, lookingFor, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = SearchHelper.generateSortedIntArray();
        int lookingFor = arr[3];
        int result = search(arr, lookingFor);
        System.out.println(result);
    }
}