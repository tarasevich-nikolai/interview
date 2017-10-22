package tarasevich.nikolai.interview.algo.search.jump;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

/**
 * @author nikolai.tarasevich
 */
public class JumpSearch {

    public static int search(int[] arr, int lookingFor) {
        int skip = (int) Math.sqrt(arr.length);

        int start = 0;

        while (start < arr.length) {
            if (arr[start] >= lookingFor) {
                break;
            }
            start += skip;
        }

        for (int i = start; i >= 0 && i > (start - skip); i--) {
            if (arr[i] == lookingFor) {
                return i;
            }
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
