import java.util.Arrays;

/**
 * Created by Elvizlai on 14-10-11.
 */
public class ShellSort {

    public static int[] sort(int[] input) {
        int d = input.length;
        int[] output = Arrays.copyOf(input, d);
        while (true) {
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < output.length; i = i + d) {
                    int temp = output[i];
                    int j;
                    for (j = i - d; j >= 0 && output[j] > temp; j = j - d) {
                        output[j + d] = output[j];
                    }
                    output[j + d] = temp;
                }
            }
            if (d == 1) {
                break;
            }
        }
        return output;
    }

}
