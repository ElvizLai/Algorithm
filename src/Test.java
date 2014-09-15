import java.util.Arrays;
import java.util.Random;

/**
 * Created by Elvizlai on 14-9-15.
 */
public class Test {

    public static void main(String[] args) {

        Random random = new Random();

        int[] a = new int[100000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(a.length);
        }

        //System.out.println("原始：" + Arrays.toString(a));

        //System.out.println("插入排序：" + Arrays.toString(InsertSort.sort(a)));
        MergeSort.merge(a);
        //System.out.println("并归排序：" + Arrays.toString(MergeSort.merge(a)));


    }
}
