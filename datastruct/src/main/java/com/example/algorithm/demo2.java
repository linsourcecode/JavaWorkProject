package com.example.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/***
 * 选择排序：
 *   假定当前的数字是最小的，与后面的数相比较，如果有比较小的就直接交换
 *
 * */
public class demo2 {
    public static void main(String[] args) {
        int[] t1 = {19,12,13,7,9,11,1};
        selectSort(t1);
        //性能测试
        int arrary[] =new int[80000];
        for(int i=0;i<80000;i++){
            arrary[i] = (int) (Math.random()*8000000);
        }
        long Start = System.currentTimeMillis();
        selectSort(arrary);
        long end = System.currentTimeMillis();
        System.out.println(end- Start);;

    }
    public static void selectSort(int[] array){
       /* int minIndex = 0;
        int min = array[0];
        for(int j=1;j<array.length;j++){
            if(min>array[j]){
                min = array[j];
                minIndex = j;

            }

        }
        array[minIndex] = array[0];
        array[0] = min;
        System.out.println(Arrays.toString(array));*/
        for(int i =0;i<array.length;i++){
            int minIndex = i;
            int min = array[i];
            for(int j=1;j<array.length;j++){

                if(min>array[j]){
                    min = array[j];
                    minIndex = j;

                }
            }

            if(minIndex!=i){
                array[minIndex] = array[i];
                array[i] = min;
            }
           // System.out.println("第"+i+"轮比较");
           // System.out.println(Arrays.toString(array));


        }





    }
}
