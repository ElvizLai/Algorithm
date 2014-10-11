import java.util.Arrays;

/**
 * Created by Elvizlai on 14-10-11.
 */
public class BubbleSort {

    public static int[] sort(int[] input) {
        int[] output = Arrays.copyOf(input, input.length);

        int temp = 0;
        for (int i = output.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (output[j + 1] < output[j]) {
                    temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        return output;
    }
}
