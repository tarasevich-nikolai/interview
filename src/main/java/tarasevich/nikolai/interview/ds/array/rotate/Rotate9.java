package tarasevich.nikolai.interview.ds.array.rotate;

/**
 * Consider an array of distinct numbers sorted in increasing order. The array has been rotated (anti-clockwise) k number of times. Given such an array, find the value of k.
 * @author nikolai.tarasevich
 */
public class Rotate9 {

    public int find1(int[] arr) {
        int result = 0;
        for (int i =1 ; i < arr.length; i++) {
            result++;
            if (arr[i - 1] > arr[i]) {
                return result;
            }
        }
        if (arr.length - 1 == result) {
            return 0;
        } else {
            return result;
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[]{2, 3, 1};
        Rotate9 rotate9 = new Rotate9();
        System.out.println(rotate9.find1(arr));
    }
}
