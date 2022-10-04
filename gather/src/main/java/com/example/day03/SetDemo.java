package com.example.day03;

import com.example.day01.OrderInfo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/***
 * Set集合: 无序不可重复
 *  HashSet：主要实现方法，存储无序 不可重复，可存储null值
 *   数组+链表的集合体
 *  添加：HashSet元素添加进去后，按照其hash值选定其数组位置，后添加的数据如果hash在同一个位置，将与之前的数据组成链表结构
 * LinkedHashSet: 比HashSet添加了两个变量，记录前后两个变量
 * TreeSet：按照对象属性排序 首先是相同的类/数据类型
 *
 *
 * */
public class SetDemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(new OrderInfo("111","111"));
        set.add(new OrderInfo("111","222"));
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
