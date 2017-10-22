package tarasevich.nikolai.interview.algo.search.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author nikolai.tarasevich
 */
public class SearchHelper {

    public static int[] generateIntArray() {
        return generateIntArray(10);
    }

    public static int[] generateIntArray(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
            list.add(i);
        Collections.shuffle(list);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int[] generateSortedIntArray() {
        return generateSortedIntArray(10);
    }

    public static int[] generateSortedIntArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 100;
        }
        return arr;
    }
}
