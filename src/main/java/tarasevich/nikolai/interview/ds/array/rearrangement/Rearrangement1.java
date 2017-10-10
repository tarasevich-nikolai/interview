package tarasevich.nikolai.interview.ds.array.rearrangement;

import java.util.Arrays;

/**
 * @author nikolai.tarasevich
 */
public class Rearrangement1 {

    public int[] rearrange(int[] array) {
        int i = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int neg = 0, pos = i + 1;
        while (pos < array.length && neg < pos && array[neg] < 0 ) {
            int temp = array[pos];
            array[pos] = array[neg];
            array[neg] = temp;
            pos++;
            neg+=2;
        }
        return array;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{4, 2, 1, -4, 2, -3, -7, -8, 3, 9, 10, -7};
        Rearrangement1 rearrangement1 = new Rearrangement1();
        int[] result = rearrangement1.rearrange(arr);
        System.out.println(Arrays.toString(result));
    }
}
