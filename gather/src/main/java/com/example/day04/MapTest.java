package com.example.day04;

import java.util.HashMap;
import java.util.Map;

/**
 * Map:双列数据
 *  HashMap:线程不安全，可存储null，效率高
 *          数组+链表 jdk7
 *          数组+链表+红黑树 jdk8
 *   LinkedHashMap:按照添加的顺序，添加前后指针
 *  TreeMap:按照key-value排序 使用红黑树结构
 *  HashTable：线程安全，效率低，不可存储null值
 *   properties:配置
 * HashMap:
 *   jdk7方案: 初始化一个长度为16的entry[]数组
 *         添加方案：
 *              按照hashcode获取位置，如果位置上不存在的位置直接插入，若存在直接与之前的数据连接形成链表
 * jdk8:底层是node[]
 *      调用再生成16的数组
 *      底层结构：数组+链表+红黑树
 *      变化：
 *           该位置的元素超过8个且数组长度超过64会改变成红黑树
 *
 *
 *
 *
 * **/
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<5;i++){
            map.put(String.valueOf(i),i);
        }
        map.put("11",110);
        map.put("12",12);
    }
}
