package com.sort;

public class SortClass {

    public static long[] sort(long[] arr) {
        for (int out = arr.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    long temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * buble sorting is cool, but I better do it like that
     */
//    public static int[] sort(int[] arr) {
//        Arrays.sort(arr);
//        return arr;
//    }

}
