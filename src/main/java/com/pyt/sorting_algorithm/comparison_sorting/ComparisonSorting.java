package com.pyt.sorting_algorithm.comparison_sorting;

import com.pyt.sorting_algorithm.exchange_method.Exchange;
import com.pyt.sorting_algorithm.utils.OrderLinkedList;

import java.util.Arrays;

/**
 * @ClassName ComparisonSorting
 * @Description TODO
 * @Author pyt
 * @Date 2019/3/18 9:47
 * @Version
 */
public class ComparisonSorting {
    /**
     * 冒泡排序
     * @param a
     */
    public static void bubble_sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    Exchange.swap(a, j, j + 1);
                }
            }
        }
    }
    /**
     * 选择排序
     * @param a
     */
    public static void selection_sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) Exchange.swap(a, i, min);
        }
    }
    /**
     * 插入排序
     * @param a
     */
    public static void insertion_sort(int[] a){
        int temp;//用于暂存需要进行插入的数据
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            for (int j = 0; j < i; j++) {
                if (a[j]>temp){
                    for (int k = i; k > j; k--) {
                        a[k] = a[k-1];
                    }
                    a[j] = temp;
                    break;
                }
            }
        }
    }

    /**
     * 希尔排序
     * 也称为“缩小增量排序”
     *不稳定排序算法
     * 注意点：增量的选取直接影响效率与准确率
     */
    public static void shell_sort(int[] a){
        for (int increment = a.length/2; increment >0 ; increment--) {//增量变化方式可更改或直接使用增量数据
            System.out.println("步长为："+increment);
            for (int i = 0; i < a.length-increment; i++) {
                if (a[i]>a[i+increment]) Exchange.swap(a, i, i+increment);
            }
            System.out.println(Arrays.toString(a));
        }
    }

    /**
     * 快速排序
     * @param a
     */
    public static void quick_sort(int[] a){
        int start_index = (int)Math.random()*a.length+1;


    }
}
