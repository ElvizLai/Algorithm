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

        System.out.println("时间：" + (System.currentTimeMillis() - begin));
        return temp;
    }

    private static void swap(int[] data, int a, int b) {
        int t = data[a];
        data[a] = data[b];
        data[b] = t;
    }


//    public static int[] mergeSorting(int[] input) {
//        if (input.length <= 1)
//            return input;
//
//        int divid = input.length / 2;
//
//        int[] tempL = Arrays.copyOf(input, divid);
//        int[] tempR = Arrays.copyOfRange(input, divid, input.length);
//
//        tempL = sort(tempL);
//        tempR = sort(tempR);
//
//        return merge(tempL, tempR);
//    }

//    //有序数列的合并
//    private static int[] merge(int[] tempL, int[] tempR) {
//        int[] result = new int[tempL.length + tempR.length];
//
//        int i, j, k;
//        i = j = k = 0;
//
//        while (i < tempL.length && j < tempR.length) {
//            if (tempL[i] <= tempR[j]) {
//                result[k++] = tempL[i++];
//            } else {
//                result[k++] = tempR[j++];
//            }
//        }
//
//        while (i < tempL.length) {
//            result[k++] = tempL[i++];
//        }
//
//        while (j < tempR.length) {
//            result[k++] = tempR[j++];
//        }
//
//        System.out.println(Arrays.toString(result));
//
//        return result;
//
//    }
}
