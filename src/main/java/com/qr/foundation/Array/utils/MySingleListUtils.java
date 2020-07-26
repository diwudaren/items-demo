package com.qr.foundation.Array.utils;

public class MySingleListUtils {

    private Node first;
    private int total;


    /**
     * 添加节点
     * @param object Object 节点元素
     */
    public void add(Object object){
        if (first == null){
            //是否是第一个节点
            first = new Node(object, null);
        }else {
            //是否是第一个节点
                Node now = first;
                while (now.next != null){
                    now = now.next;
                }
                now.next = new Node(object, null);
        }
        total++;
    }

    /**
     * 删除树节点
     * @param object Object 要删除的节点
     */
    public void remove(Object object){
        if (object == null){
            if (first.data == null){
                first = first.next;
            }else {
                Node left = first;
                Node now = first.next;
                while (now.data != null){
                    left = now;
                    now = now.next;
                }
                left.next = now.next;
            }

        }else {
            if (object.equals(first.data)){
                first = first.next;
            }else {
                Node left = first;
                Node now = first.next;
                while (!object.equals(now.data)){
                    left = now;
                    now = now.next;
                }
                left.next = now.next;
            }
        }
        total --;
    }


    public Object[] toArray(){
        Object[] array = new Object[total];
        Node now = first;
        for (int i =0; i < array.length; i++){
            array[i] = now.data;
            now = now.next;
        }
        return array;

    }

    /**
     * Node 自定义节点
     */
    static class Node{
        Object data;
        Node next;

        public Node(Object data, Node next) {
            super();
            this.data = data;
            this.next = next;
        }
    }

}
