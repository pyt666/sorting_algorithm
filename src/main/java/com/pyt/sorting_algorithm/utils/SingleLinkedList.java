package com.pyt.sorting_algorithm.utils;


/**
 * @ClassName SingleLinkedList
 * @Description 单向链表
 * @Author pyt
 * @Date 2019/3/19 11:15
 * @Version
 */
public class SingleLinkedList {
    private int size;//链表节点的个数
    private Node head;//头节点

    //构造函数
    public SingleLinkedList(){
        size = 0;
        head = null;
    }

    //内部类
    //链表的每个节点类
    private class Node{
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的连接
        public Node(Object data){
            this.data = data;
        }
    }

    //在链表头添加元素
    public Object addHead(Object object){
        Node newHead = new Node(object);
        if (size == 0){
            head = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
        size++;
        return object;
    }

    //在链表头删除元素,并返回删除元素
    public Object deleteHead(){
        Object object = head.data;
        head = head.next;
        size--;
        return object;
    }

    //查找指定元素，找到了返回节点Node，找不到返回null
    public Node find(Object object){
        Node current = head;
        int tempSize = size;
        while (tempSize>0){
            if (object.equals(current.data))
                return current;
            else
                current = current.next;
            tempSize--;
        }
        return null;
    }

    //删除指定元素，删除成功返回true，失败返回false
    public boolean delete(Object object){
        if (size == 0)
            return false;
        Node current = head;
        Node previous = head;
        while (current.data != object){
            if (current.next == null)
                return false;
            else {
                previous = current;
                current = current.next;
            }
        }
        //如果删除的节点是第一个节点
        if (current == head){
            head = current.next;
            size--;
        }else {
            previous.next = current.next;
            size--;
        }
        return true;
    }

    //判断链表是否为空，为空返回true
    public  boolean isEmpty(){
        return size==0;
    }

    //显示节点信息
    public void display(){
        if (size>0){
            Node node = head;
            int tempSize = size;
            if (tempSize == 1){
                //当前链表只有一个节点
                System.out.println("["+node.data+"]");
                return;
            }
            while(tempSize>0){
               if (node.equals(head))
                   System.out.print("["+node.data+"->");
               else if (node.next == null)
                   System.out.print(node.data+"]");
               else System.out.print(node.data+"->");
               node = node.next;
               tempSize--;
            }
            System.out.println();
        }else{
            System.out.println("[]");
        }

    }


}
