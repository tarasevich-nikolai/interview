package tarasevich.nikolai.interview.algo.search.fibonacci;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

public class FibonacciSearch {

    public static int search(int[] arr, int lookingFor) {
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = SearchHelper.generateSortedIntArray();
        int lookingFor = arr[7];
        int result = search(arr, lookingFor);
        System.out.println(result);
    }
}