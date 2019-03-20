package com.pyt.sorting_algorithm.exchange_method;

/**
 * @ClassName Exchange
 * @Description TODO
 * @Author pyt
 * @Date 2019/3/18 10:09
 * @Version
 */
public class Exchange {
    /**
     * 使用异或^实现数据交换
     * @param a
     * @param i
     * @param j
     */
    public static void swap(int[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}

