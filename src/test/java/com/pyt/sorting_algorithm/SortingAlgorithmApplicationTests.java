package com.pyt.sorting_algorithm;

import com.pyt.sorting_algorithm.comparison_sorting.ComparisonSorting;
import com.pyt.sorting_algorithm.exchange_method.Exchange;
import com.pyt.sorting_algorithm.utils.OrderLinkedList;
import com.pyt.sorting_algorithm.utils.SingleLinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SortingAlgorithmApplicationTests {

    @Test
    public void contextLoads() {
        /*int[] a = {6, 3, 8, 2, 9, 1};
        Exchange.swap(arr,0,1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }*/
        /*int[] a = {6, 3, 8, 2, 9, 1};
        ComparisonSorting.bubble_sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }*/
        /*int[] a = {6, 3, 8, 2, 9, 1};
        ComparisonSorting.selection_sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }*/

       /* SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("A");
        singleLinkedList.addHead("B");
        singleLinkedList.addHead("C");
        singleLinkedList.addHead("D");
        singleLinkedList.display();
        singleLinkedList.delete("C");
        singleLinkedList.display();
        System.out.println(singleLinkedList.find("B"));*/
       /* OrderLinkedList orderLinkedList = new OrderLinkedList();
        orderLinkedList.insert(1);
        orderLinkedList.display();
        orderLinkedList.insert(2);
        orderLinkedList.display();*/
//        int[] a = {6, 3, 8, 2, 9, 1};
//        ComparisonSorting.insertion_sort(a);
//        int[] data = new int[] { 49,38,65,97,76,13,27,49,55,4};
//        ComparisonSorting.shell_sort(data);
//        System.out.println(Arrays.toString(data));
         int[] a = {6, 3, 8, 2, 9, 1};
         ComparisonSorting.insertion_sort(a);
    }

}
