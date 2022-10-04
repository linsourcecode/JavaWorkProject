package DP;
/**
 * 最小爬台阶问题
 *   思路：可以维护一个数组，保证跳跃都是最小,思路是
 *      将整体分为多个两步走，在从两步走 分为一步或者两步，局部控制为最优
 *
 * */
public class demo2 {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,90,1,1,80,1};
        //首先我们要确定的是跳一个或者两个台阶

        System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs (int[] cost) {
        // write code here
        int length = cost.length;

        //默认从1开始
        int[] dp=new int[length+1];

        for(int i=2;i<=cost.length;i++){
            dp[i] = Math.min(cost[i-1]+dp[i-1],dp[i-2]+cost[i-2]);
        }
        return  dp[cost.length];
    }
}
