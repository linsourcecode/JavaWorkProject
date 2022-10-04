package DP;
/**
 * 求一个二维矩阵的不同路径
 *    思路
 *       把矩阵行列第一行第一列都定义为一
 *       每次往右或者左一格都会加一
 * */
public class demo4 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(2, 1));
    }
    public static  int uniquePaths (int m, int n) {
        // write code here
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        //第一列初始化，只有一条路径
        for(int i=0;i<m;i++){
            dp[i][0] =1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
