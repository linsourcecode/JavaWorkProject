package com.example;
/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *
 * */
public class Demo002 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    /**
     *这里使用头结点
     *  建立一个头结点
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        ListNode head = new ListNode(0);
        //head.next=new ListNode(0);
        int k2 = 0;
        ListNode temp = head;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int target = x + y + k2;

            int k1 = target % 10;
            k2 = target / 10;

            temp.val = k1;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if ((l1 != null || l2 != null)) {
                temp.next = new ListNode(k2);
                temp = temp.next;
            }
        }
        //在链表长度相同时，可能存在丢失十位数的问题
        if (k2 == 1) {
            temp.next = new ListNode(k2);

        }
        return head;

    }}

