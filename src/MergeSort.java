import java.util.Arrays;

/**
 * Created by Elvizlai on 14-9-15.
 */
public class MergeSort {

    public static int[] merge(int[] a) {
        long begin = System.currentTimeMillis();
        int[] temp = new int[a.length];

        mergesort(Arrays.copyOf(a, a.length), 0, a.length - 1, temp);
        System.out.println("时间：" + (System.currentTimeMillis() - begin));
        return temp;
    }


    private static void mergesort(int[] a, int first, int last, int[] temp) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergesort(a, first, mid, temp);
            mergesort(a, mid + 1, last, temp);
            mergearray(a, first, mid, last, temp);
        }
    }

    private static void mergearray(int[] a, int first, int mid, int last, int[] temp) {

        int i = first, j = mid + 1;

        int index = 0;

        while (i <= mid && j <= last) {
            if (a[i] <= a[j])
                temp[index++] = a[i++];
            else
                temp[index++] = a[j++];
        }

        while (i <= mid)
            temp[index++] = a[i++];

        while (j <= last)
            temp[index++] = a[j++];

        for (i = 0; i < index; i++)
            a[first + i] = temp[i];

        //System.out.println(Arrays.toString(a)+" "+Arrays.toString(temp));
    }

}
