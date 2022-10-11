package com.example.algorithm;
/**
 * 快速排序的思想：
 *   通过一次遍历确立中位数，把数据分成两部分，一遍永远比中间数大
 *   8亿条数据7秒
 *
 *
 * **/
public class demo6 {
    public static void main(String[] args) {
        int array[] =new int[80000];

        for(int i=0;i<80000;i++){
            array[i] = (int) (Math.random()*800000000);
        }
        long Start = System.currentTimeMillis();
        array = quitsort(array,0,array.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end- Start);;


    }
    public static int[] quitsort(int[] arrays,int left, int right){
        int l = left;
        int r= right;
        //获取中轴
        int pri = arrays[(l+right)/2];
        int temp=0;
        //在这里确定一个中位数
        while(l<r){
            while(arrays[l]<pri){
                l=l+1;
            }
            while(arrays[r]>pri){
                r =r-1;
            }
            //已实现左小右大的数据排列
            if(l>=r){
               break;
            }
            //交换
            temp=arrays[l];
            arrays[l] = arrays[r];
            arrays[r] =temp;
            //这里使用两个哨兵的机制
            if(arrays[l]==pri){
                r=r-1;

            }
            if(arrays[r]==pri){
               l=l+1;

            }


        }
       //退一位避免栈溢出
        if(l==r){
            l++;
            r--;
        }
        //向左递归
        if(l<r){
            quitsort(arrays,left,r);

        }
        //向右递归
        if(right>l){
           quitsort(arrays,l,right);
        }






        return  arrays;
    }
}
