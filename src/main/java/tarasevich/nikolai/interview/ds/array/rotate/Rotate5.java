package tarasevich.nikolai.interview.ds.array.rotate;

/**
 * Search an element in a sorted and rotated array
 * @author nikolai.tarasevich
 */
public class Rotate5 {

    public int find(int[] arr, int key) {
        int start = findStart(arr);
        if (start == key) {
            return key;
        }
        int firstResult = binarySearch(arr, 0, start, key);
        int secondResult = binarySearch(arr, start + 1, arr.length - 1, key);
        if (firstResult != -1) {
            return firstResult;
        } else if (secondResult != -1) {
            return secondResult;
        } else {
            return -1;
        }
    }

    public int findStart(int arr[]) {
        int min = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
        return binarySearch(arr, low, high, key);
    }

    public static void main(String args[]) {
        int[] arr = new int[]{4, 5, 6, 7, 8, 1, 2, 3};
        int find = 23;
        Rotate5 rotate5 = new Rotate5();
        System.out.println(rotate5.find(arr, find));
    }
}
