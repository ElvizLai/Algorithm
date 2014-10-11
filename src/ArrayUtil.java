/**
 * Created by Elvizlai on 14-10-10.
 */
public class ArrayUtil {

    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        return max;
    }


    public static double average(int[] a) {
        int N = a.length;
        double sum = 0.0;
        for (int i : a) {
            sum += i;
        }
        return sum / N;
    }

    public static int[] copy(int[] a) {
//        int[] temp = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            temp[i] = a[i];
//        }
//
//        return temp;
        return a.clone();
    }

    public static int[] reverse(int[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            int temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }

        return a;
    }


}
