import java.util.Arrays;

/**
 * Created by Elvizlai on 14-9-15.
 */
public class InsertSort {

    public static int[] sort(int[] input) {
        long begin = System.currentTimeMillis();

        if (input.length <= 1)
            return input;
        //make copy of original int[]
        int[] temp = Arrays.copyOf(input, input.length);


        for (int i = 1; i < temp.length; i++) {
            while (temp[i] < temp[i - 1]) {
                swap(temp, i - 1, i);
                i--;
                if (i == 0) {
                    break;
                }
            }
        }

        System.out.println("InsertSort:" + (System.currentTimeMillis() - begin)+" ms");
        return temp;
    }

    private static void swap(int[] data, int a, int b) {
        int t = data[a];
        data[a] = data[b];
        data[b] = t;
    }
}
