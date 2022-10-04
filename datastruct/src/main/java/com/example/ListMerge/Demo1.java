package com.example.ListMerge;
/*
*****/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Demo1 {

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode listNode=new ListNode(-1);
        ListNode cur = listNode;
        //两个列表都不为空
        while(list1!=null && list2!=null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;

            }
            else if(list1.val == list2.val){
                cur.next = list2;
                cur = cur.next;
                cur.next = list1;
                list1 = list1.next;
                list2 = list2.next;
            }
            cur = cur.next;

        }
        cur.next =list1!=null ? list1:list2;
        return  listNode.next;

    }
    public ListNode Merge2(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode res = null;
        if(list1.val<list2.val){
            res = list1;
            res.next = Merge2(list1.next, list2);
        }else{
            res = list2;
            res.next = Merge2(list1, list2.next);
        }
        return res;
    }
}
