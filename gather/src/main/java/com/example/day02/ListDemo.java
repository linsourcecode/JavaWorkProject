package com.example.day02;
/**
 * List:
 *    ArrayList: List主要实现类，线程不安全 使用Object[]保存数据
 *    LinkedList:有序列表 使用双向链表存储数据，适用于增删场景，查询较慢
 *    Vector:线程安全 使用Object[]保存数据
 *
 * ArrayList:
 *   jdk7 创建：长度为10的Object数组
 *        扩容：1.5倍
 *   jdk8 创建：未立即分配空间，初始化为{}
 *        扩容：初始化空间为add才分配空间为10 ，扩容按1.5倍
 *
 *LinkedList:
 *      思路：每一个添加的都封装在node节点中：
 *      增删改查使用node的前后指针遍历
 *      private static class Node<E> {
 *         E item;
 *         Node<E> next;
 *         Node<E> prev;
 *
 *         Node(Node<E> prev, E element, Node<E> next) {
 *             this.item = element;
 *             this.next = next;
 *             this.prev = prev;
 *         }
 *     }
 *Vector:
 *      线程安全，synchronized同步方法 扩容为两倍
 * */
public class ListDemo {
}
