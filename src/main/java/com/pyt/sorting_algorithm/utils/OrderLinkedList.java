package com.pyt.sorting_algorithm.utils;

/**
 * @ClassName OrderLinkedList
 * @Description TODO
 * @Author pyt
 * @Date 2019/3/19 17:53
 * @Version
 */
public class OrderLinkedList {
    private Node head;
    private int size;
    private class Node{
        private double data;
        private Node next;
        public Node(double data){
            this.data = data;
        }
    }
    public OrderLinkedList(){
        head = null;
    }
    //插入节点，按照从小到大的顺序排列
    public void insert(double value){
        Node node = new Node(value);
        Node pre = null;
        Node current = head;
        while(current != null && value > current.data){
            pre = current;
            current = current.next;
        }
        if (pre == null){
            head = node;
            head.next = current;
        }else{
            pre.next = node;
            node.next = current;
        }
        size++;
    }

    public void display(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println("");
    }

    public double[] getArray(){
        double[] a = new double[size];
        Node current = head;
        int index = 0;
        while (current!=null){
            a[index] = current.data;
            current = current.next;
            index++;
        }
        return a;
    }
}
