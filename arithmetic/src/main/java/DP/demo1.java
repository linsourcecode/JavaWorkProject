package DP;
/**
 * 青蛙跳台阶问题
 * 思路是
 *   第二个台阶只能跳二阶或者从第一个台阶跳一阶
 *   第二个台阶只能跳二阶或者从第一个台阶跳一阶
 *   第三个台阶可以从第一个台阶跳两阶段
 *               从第二个台阶跳一阶
 * */
public class demo1 {
    public static void main(String[] args) {
        System.out.println(getRun(3));

    }
     static  int getRun(int target){
         int[] dp=new int[1005];
         dp[1]=1;
         dp[2]=2;
         int goal=dp[1]+dp[2];
         for(int i=3;i<=target;i++){
             dp[i]=dp[i-1]+dp[i-2];


         }
         return dp[target];

    }
}
