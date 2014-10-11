import java.util.Arrays;

/**
 * Created by Elvizlai on 14-9-17.
 */
public class QucikSort {

    public static int[] sort(int[] data) {
        long begin = System.currentTimeMillis();
        int[] temp = Arrays.copyOf(data, data.length);

        sort(temp, 0, temp.length - 1);

        System.out.println("QuickSort:" + (System.currentTimeMillis() - begin) + " ms");
        return temp;
    }

    private static void sort(int[] data, int low, int high) {
        if (low < high) {
            int q = partition(data, low, high);
            sort(data, low, q - 1);
            sort(data, q + 1, high);
        }
    }

    private static int partition(int[] data, int lowIndex, int highIndex) {
        int picked = data[highIndex];
        int index = lowIndex - 1;
        for (int i = lowIndex; i <= highIndex - 1; i++) {
            if (data[i] <= picked) {
                //index = index + 1;
                swap(data, ++index, i);
            }
        }
        swap(data, index + 1, highIndex);
        return index + 1;
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) {
        int[] a={0,0,0,0};

        sort(a);
    }
}
