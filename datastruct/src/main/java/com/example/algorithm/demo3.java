package com.example.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 插入排序
 *    从零开始，逐一将较小的数字插入小的序号
 *
 * **/
public class demo3 {
    public static void main(String[] args) {
        int arrary[] =new int[80000];
        for(int i=0;i<80000;i++){
            arrary[i] = (int) (Math.random()*8000000);
        }
        long Start = System.currentTimeMillis();
        insertSort(arrary);
        long end = System.currentTimeMillis();
        System.out.println(end- Start);;
    }
    public  static  void insertSort(int[] array){
       for(int i=1;i<array.length;i++){
           int insertval = array[i];
           int insertIndex = i-1;
           //寻找插入的位置
           while(insertIndex>=0&& insertval <array[insertIndex]){
               array[insertIndex+1] = array[insertIndex];
               insertIndex--;
           }
           //if(insertIndex+1==i)
           array[insertIndex+1] = insertval;
           //System.out.println(Arrays.toString(array));


       }


    }
}
