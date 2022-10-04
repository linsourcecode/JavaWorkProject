package com.example.algorithm;
/***
 * 希尔排序：
 *    插入排序+分组的结合体
 *
 * */
public class demo4 {
    public static void main(String[] args) {
        int arrary[] =new int[80000];
        for(int i=0;i<80000;i++){
            arrary[i] = (int) (Math.random()*8000000);
        }
        long Start = System.currentTimeMillis();
        int[] t1 = {1,4,5,6,7,8,9,0,2,3};

        shellsort2(arrary);
        long end = System.currentTimeMillis();
        System.out.println(end- Start);;
    }
    public static void shellsort(int[] arr){
      int temp=0;
      for(int gap= arr.length/2;gap>0;gap/=2){
          for(int i=gap;i<arr.length;i++){
              for(int j=i-gap;j>=0;j-=gap){
                  if(arr[j]>arr[j+gap]){
                    temp = arr[j];
                    arr[j]= arr[j+gap];
                    arr[j+gap] =temp;
                  }}}}
    }
    /***
     * 优化
     *
     * */
    public static void shellsort2(int[] arr){

        for(int gap= arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
               int j=i;
               int temp= arr[i];
               //优化一 减少不必要的循环
               if(arr[j]<arr[j-gap]){
                   while(j-gap>=0&& temp<arr[j-gap]){
                       arr[j] =arr[j-gap];
                       j-=gap;

                   }
                   arr[j] = temp;
               }


            }


        }



    }
}
