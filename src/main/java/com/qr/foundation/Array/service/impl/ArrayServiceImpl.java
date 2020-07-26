package com.qr.foundation.Array.service.impl;

import com.qr.foundation.Array.service.ArrayService;
import com.qr.foundation.Array.utils.MyArrayListUtils;
import com.qr.foundation.Array.utils.MySingleListUtils;
import org.springframework.stereotype.Service;

@Service
public class ArrayServiceImpl implements ArrayService {

    /**
     * 自定义集合测试
     */
    @Override
    public void myArrayListTest() {
        MyArrayListUtils maArrayList = new MyArrayListUtils();
        maArrayList.add("测试一");
        maArrayList.add("测试二");
        maArrayList.add("测试三");
        maArrayList.add("测试四");
        maArrayList.add("测试一");
        maArrayList.add("测试二");
        maArrayList.add("测试三");
        maArrayList.add("测试四");
        maArrayList.add("测试一");
        maArrayList.add("测试二");
        maArrayList.add("测试四");
        maArrayList.add("测试一");
        maArrayList.add("测试二");
        maArrayList.add(null);
        maArrayList.add("测试四");
        maArrayList.add("测试一");
        maArrayList.add("测试二");
        maArrayList.add("测试三");
        maArrayList.add("测试四");

        for (int i = 0; i < maArrayList.size(); i++){
            System.out.println(maArrayList.get(i));
        }

        int size = maArrayList.size();
        System.out.println(size);
        int indexOf = maArrayList.indexOf(null);
        System.out.println(indexOf);
        maArrayList.remove("测试二");
        for (int i = 0; i < maArrayList.size(); i++){
            System.out.println(maArrayList.get(i));
        }
        System.out.println(maArrayList.toString());
        maArrayList.set("测试二","AAAAAAA");
        for (int i = 0; i < maArrayList.size(); i++){
            System.out.println(maArrayList.get(i));
        }
    }

    /**
     * 自定义 单项列表测试
     */
    @Override
    public void MySingleListTest() {
        MySingleListUtils singleListUtils = new MySingleListUtils();
        singleListUtils.add("测试一");
        singleListUtils.add("测试二");
        singleListUtils.add("测试三");
        singleListUtils.add("测试四");
        singleListUtils.add("测试五");
        singleListUtils.add("测试六");
        singleListUtils.add("测试七");
        singleListUtils.add("测试八");
        singleListUtils.add("测试九");
        singleListUtils.add("测试十");
        singleListUtils.add("测试十一");
        singleListUtils.add("测试十二");
        Object[] objects = singleListUtils.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println("----------------------------");
        singleListUtils.remove("测试六");
        Object[] objects1 = singleListUtils.toArray();
        for (Object o : objects1) {
            System.out.println(o);
        }
        System.out.println("=============================");
        singleListUtils.remove("测试一");
        Object[] objects2 = singleListUtils.toArray();
        for (Object o : objects2) {
            System.out.println(o);
        }
        System.out.println("**************************");
        singleListUtils.remove("测试十二");
        Object[] objects3 = singleListUtils.toArray();
        for (Object o : objects3) {
            System.out.println(o);
        }
    }
}
