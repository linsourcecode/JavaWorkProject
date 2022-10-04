package DP;
/** 打家劫舍问题
 *   你是一个经验丰富的小偷，准备偷沿街的一排房间，每个房间都存有一定的现金，为了防止被发现，你不能偷相邻的两家，即，如果偷了第一家，就不能再偷第二家；如果偷了第二家，那么就不能偷第一家和第三家。
 * 给定一个整数数组nums，数组中的元素表示每个房间存有的现金数额，请你计算在不被发现的前提下最多的偷窃金额。
 * 例子：
 * 输入：
 * [1,2,3,4]
 * 复制
 * 返回值：
 * 6
 * 复制
 * 说明：
 * 最优方案是偷第 2，4 个房间
 * 解决思路
 *   为了简单，我们可以 设定拿出三个的数组dp[1,2,3],dp的最大的收益是 dp[0]+dp[3] 或者是dp[2],所以我们的每一个计算最大的收益都是前一，二的最大的收益的值
 * 返回到题目可得，每次的收益是前一，二的累计比较所得，到这里就很好做了
*
* */
public class demo7 {
    public static void main(String[] args) {
        System.out.println(demo7.rob(new int[]{1, 2, 3}));
    }
    public static int rob (int[] nums) {
        //dp[i]表示长度为i的数组，最多能偷取多少钱
        int[] dp = new int[nums.length + 1];
        //长度为1只能偷第一家
        dp[1] = nums[0];
        int i;
        System.out.println(dp[1]);
        for (i = 2; i <= nums.length; i++){
            //比较 dp[i - 1]代表上一家的收益
            //dp[i-2]等于上上一家的 nums[i - 1]代表为中间的值（因为dp的数组索引比num大了一位，所以num[i-1]代表的是当前的值）
            dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);

        }
        return dp[nums.length];
    }
}
