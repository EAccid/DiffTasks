package algorithms.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {8, 5, 4, 12, 2, 6};

        System.out.println(Arrays.toString(array));
        sort(array, 0, array.length);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] result, int start, int length) {

        if (start + 1 < length) {
            int half = (start + length) >>> 1;
            sort(result, start, half);
            sort(result, half, length);

            int size = length - start;
            int[] b = new int[size];
            int i = start;
            int j = half;
            for (int k = 0; k < size; k++) {
                if (j >= length || i < half && result[i] < result[j]) {
                    b[k] = result[i++];
                } else {
                    b[k] = result[j++];
                }
            }
            System.arraycopy(b, 0, result, start, size);
        }


    }
}
