package com.qr.foundation.Array.utils;

import java.util.Arrays;

public class MyArrayListUtils {

    /**
     * 对象
     */
    private Object[] data;
    //索引
    private int total;

    /**
     * 初始化长度
     */
    public MyArrayListUtils(){
        data = new Object[10];
    }

    /**
     * 添加元素
     * @param object Object 要添加的参数
     */
    public void add(Object object){
        if (total >= data.length){
            data = Arrays.copyOf(data,data.length * 2);
        }
        data[total++] = object;
    }

    /**
     * 获取index 的位置
     * @return
     */
    public int size(){
        return total;
    }


    /**
     * 获取指定元素
     */

    public Object get(int index){

        if (index <0 || index >= total){
            throw new IndexOutOfBoundsException(index+"不合法");
        }
        return data[index];

    }


    /**
     * 查找 obj 当前索引，没有返回 -1
     */

    public int indexOf(Object obj) {

        int index = -1;
        if (obj == null) {
            for (int i = 0; i < total; i++) {
                if (obj == data[i]) {
                    index = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < total; i++) {
                if (obj.equals(data[i])) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    /**
     * 删除指定元素
     * @param obj Object 要删除的参数
     */
    public void remove(Object obj){
        int index = indexOf(obj);
        if (index != -1){
            System.arraycopy(data, index + 1, data, index, total - index - 1);
            data[--total] = "null";
        }
    }

    /**
     * 把第一个参数替换调
     */

    public void set(Object oid, Object dest){
        int index = indexOf(oid);
        if (index != -1){
            data[index] = dest;
        }
    }

}
