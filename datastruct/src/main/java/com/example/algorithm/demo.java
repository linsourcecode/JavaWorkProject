package com.example.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] t1 = {1,12,13,7,9,11};

        /*//第一趟排序，获取数组最大的数值
        for(int i=0;i<t1.length-1;i++){

           if(t1[i]>t1[i+1]){
               temp = t1[i];
               t1[i] = t1[i+1];
               t1[i+1]=temp;

           }
        }
        System.out.println(Arrays.toString(t1));*/
        int arrary[] =new int[80000];
        for(int i=0;i<80000;i++){
            arrary[i] = (int) (Math.random()*8000000);
        }
        long Start = System.currentTimeMillis();
        sort(arrary);
        long end = System.currentTimeMillis();
        System.out.println(end- Start);;


    }
    public  static void sort(int[] t1){
        boolean flag = true;
        int temp =0 ;
        for(int i=0;i<t1.length-1;i++){
            for(int j=0;j<t1.length-1-i;j++){
                flag=false;
                if(t1[j]>t1[j+1]){
                    temp = t1[j];
                    t1[j] = t1[j+1];
                    t1[j+1]=temp;

                }


            }
           // System.out.println("遍历第"+i+"次");
           // System.out.println(Arrays.toString(t1));
            //发现有一趟不发生交换就终止冒泡排序

            if(flag){
                break;
            }else{
                flag=true;
            }

        }

    }
}
