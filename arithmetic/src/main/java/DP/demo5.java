package DP;
/***
 * 矩阵的最小代价：
 *    解决方法：
 *      保证局部最优解
 *
 * **/
public class demo5 {
    public static void main(String[] args) {
        int[][]dp={{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(minPathSum(dp));
    }
    public static int minPathSum (int[][] matrix) {
        // write code here
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] dp=new int[row][col];
        dp[0][0] = matrix[0][0];
        // 初始化第一行
        for (int i = 1; i < col; i ++)
            dp[0][i] = dp[0][i - 1] + matrix[0][i];
        // 初始化第一列
        for (int i = 1; i < row; i ++)
            dp[i][0] = dp[i - 1][0] + matrix[i][0];
        // 动态规划
        for (int i = 1; i < row; i ++) {
            for (int j = 1; j < col; j ++) {
                //每一步右还是向左代价更小  matrix[i][j]是每一步
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }
        return dp[row - 1][col - 1]; // 右下角元素结果即为答案
    }
}
