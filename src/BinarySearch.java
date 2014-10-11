/**
 * Created by Elvizlai on 14-10-10.
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (key < a[mid]) return rank(key, a, low, mid);
        else if (key > a[mid]) return rank(key, a, mid, high);
        else return mid;
    }


}
