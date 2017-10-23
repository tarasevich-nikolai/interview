package tarasevich.nikolai.interview.algo.search.fibonacci;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

import java.util.Arrays;

public class FibonacciSearch {

    public static int search(int[] arr, int lookingFor) {
        return searchWithFib(arr, lookingFor, 0);
    }

    private static int searchWithFib(int[] arr, int lookingFor, int count) {
        int startIndex = 0;
        int start = fib(startIndex);

        if (arr.length == 1) {
            if (arr[0] == lookingFor) {
                return count;
            } else {
                return -1;
            }
        }

        while (start <= arr.length && arr[start] < lookingFor) {

            startIndex++;
            start = fib(startIndex);
        }

        return searchWithFib(Arrays.copyOfRange(arr, start / 2 + 1, start + 1), lookingFor, count + start / 2 + 1);
    }

    private static int fib(int i) {
        if (i > 1) {
            return fib(i - 1) + fib(i - 2);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int[] arr = SearchHelper.generateSortedIntArray();
        int lookingFor = arr[1];
        int result = search(arr, lookingFor);
        System.out.println(result);
    }
}