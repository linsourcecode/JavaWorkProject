package DP;
/**
 * ������̨������
 * ˼·��
 *   �ڶ���̨��ֻ�������׻��ߴӵ�һ��̨����һ��
 *   �ڶ���̨��ֻ�������׻��ߴӵ�һ��̨����һ��
 *   ������̨�׿��Դӵ�һ��̨�������׶�
 *               �ӵڶ���̨����һ��
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
