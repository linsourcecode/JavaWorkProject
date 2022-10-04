package com.example.day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 测试collection集合方法
 * */
public class CollectionTest {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        //自动装箱
        collection.add(11);
        collection.add(12);
        System.out.println(true == collection.contains(11));
        /**添加数据会调用equals方法
         * */
        Object object = new OrderInfo("111","111");
        OrderInfo orderInfo=(OrderInfo)object;
        System.out.println(orderInfo);
        collection.add(new OrderInfo("111","111"));
        OrderInfo orderInfo2=new OrderInfo("111", "111");
        System.out.println(collection.contains(orderInfo2));

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
