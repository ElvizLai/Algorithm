import java.util.Arrays;

/**
 * Created by Elvizlai on 14-9-16.
 */

public class HeapSort {
    private static int getLeftChild(int current) {
        return (current << 1) + 1;
    }

    private static int getRightChild(int current) {
        return (current << 1) + 2;
    }


    private static void maxHeapify(int[] data, int current) {
        int left = getLeftChild(current);
        int right = getRightChild(current);

        int largest = current;

        if (left < data.length && data[current] < data[left])
            largest = left;
        if (right < data.length && data[largest] < data[right])
            largest = right;

        if (largest != current) {
            swap(data, largest, current);
            maxHeapify(data, largest);
        }
    }

    public static void maxHeapify_ur(int[] data, int current) {

        int l = getLeftChild(current);
        int r = getRightChild(current);
        int largest = current;
        while (true) {
            if (l < data.length && data[l] > data[current])
                largest = l;
            if (r < data.length && data[r] > data[largest])
                largest = r;
            if (current != largest)
                swap(data, current, largest);
            else
                break;
            current = largest;
            l = getLeftChild(largest);
            r = getRightChild(largest);
        }

    }

    private static void maxHeapify(int[] data, int current, int length) {
        int left = getLeftChild(current);
        int right = getRightChild(current);

        int largest = current;

        if (left < length && data[current] < data[left])
            largest = left;
        if (right < length && data[largest] < data[right])
            largest = right;

        if (largest != current) {
            swap(data, largest, current);
            maxHeapify(data, largest, length);
        }
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void buildMaxHeap(int[] data) {
        for (int i = (data.length - 2) >> 1; i >= 0; i--) {
            maxHeapify_ur(data, i);
        }
    }

    public static int[] sort(int[] data) {
        long begin = System.currentTimeMillis();

        if (data == null || data.length <= 1)
            return data;

        int[] temp = Arrays.copyOf(data, data.length);

        buildMaxHeap(temp);

        for (int i = temp.length - 1; i > 0; i--) {
            swap(temp, i, 0);
            maxHeapify(temp, 0, i);
        }
        System.out.println("HeapSort:" + (System.currentTimeMillis() - begin)+" ms");
        return temp;
    }

}
