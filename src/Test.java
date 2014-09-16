import java.util.Random;

/**
 * Created by Elvizlai on 14-9-15.
 */
public class Test {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println("------- " + i + " -------");
            run();
        }

    }

    private static void run() {
        Random random = new Random();
        int[] input = new int[10000];

        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(input.length);
        }

        //System.out.println(Arrays.toString(input));

        int[] a = InsertSort.sort(input);
        int[] b = MergeSort.sort(input);
        int[] c = HeapSort.sort(input);

        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(b));
        //System.out.println(Arrays.toString(c));

    }
}
