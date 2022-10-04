package 笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二维矩阵
 * 第一行包含两个正整数n和m ，分别表示居民的数量和商城数量。
 *
 * 接下来一行包含n+m个正整数，第i个数xi(1≤x1<x2<...<xn+m≤109) 表示第i个位置的坐标，数据保证每个xi互不相同。
 *
 * 接下来一行包含n+m个正整数，第i个数ti(0≤ti≤1) 表示第i个位置的是居民还是商场，如果ti=0则该点为居民，如果ti=1则为商场。数据保证有m个i满足ti=1。
*
* */
public class baidudeom1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m = scanner.nextInt();
        int n=scanner.nextInt();
        String[] dp=scanner.nextLine().split(",");

       int[]f1 =  runMan1(2, 3, new int[]{1, 2, 3, 4, 5}, new int[]{1, 0, 1, 0, 1});
        for (int i : f1) {
           System.out.println(i);
        }
    }
   /**  int[] m 居民
    *   int[] n 商场
    * */

   public static int[]  runMan1(int m,int n ,int[] dp,int index[]){
       int[] data = new int[(n+m)];
       int[] p1=new int[n];
       System.out.println(data[2]);
        for(int i=0;i<dp.length;i++){
            //距离
            if(index[i]==0){
                int flag=i;
                int flag1=i-1;
                //System.out.println("用户"+i);
                while(true){
                    if(flag1>=0&&index[flag1]==1){
                       // System.out.println(i+"选择了 "+flag1);
                        data[flag1]+=1;

                        break;
                    }

                    //向右一步
                    else if(flag<dp.length&&index[flag]==1){
                       // System.out.println(i + "选择了 "+flag);
                        data[flag]=data[flag]+1;
                        break;

                    }
                    flag=flag+1;
                    flag1=flag1-1;
                    //System.out.println(flag);
                   // System.out.println("加了一次"+flag1);

                }


            }
        }
        int k=0;
       for (int datum : data) {

          if(datum!=0){
              p1[k]=datum;
              k=k+1;
          }

       }
       return  p1;




   }

}
