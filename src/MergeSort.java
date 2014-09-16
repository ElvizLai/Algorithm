import java.util.Arrays;

/**
 * Created by Elvizlai on 14-9-15.
 */
public class MergeSort {

    private static void mergesort(int[] a, int start, int end, int[] temp) {
        if (start < end) {
            //int middle = (start + end) / 2;
            int middle = start + ((end - start) >> 1);
            mergesort(a, start, middle, temp);
            mergesort(a, middle + 1, end, temp);
            mergearray(a, start, middle, end, temp);
        }
    }


    private static void mergearray(int[] a, int start, int middle, int end, int[] temp) {

        int i = start, j = middle + 1;

        int index = 0;

        while (i <= middle && j <= end) {
            if (a[i] <= a[j])
                temp[index++] = a[i++];
            else
                temp[index++] = a[j++];
        }

        while (i <= middle)
            temp[index++] = a[i++];

        while (j <= end)
            temp[index++] = a[j++];

        for (i = 0; i < index; i++)
            a[start + i] = temp[i];
    }

    public static int[] sort(int[] a) {
        long begin = System.currentTimeMillis();
        int[] temp = new int[a.length];

        mergesort(Arrays.copyOf(a, a.length), 0, a.length - 1, temp);
        System.out.println("MergeSort:" + (System.currentTimeMillis() - begin)+" ms");
        return temp;
    }

}
