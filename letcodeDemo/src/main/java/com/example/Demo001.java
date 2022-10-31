package com.example;

import java.util.*;

public class Demo001 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2,5,5,11}, 10);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
    /*
    *
    * 暴力枚举 时间复杂度：O(N^2)O(N）空间复杂度：O(1)

    * */
/*    public  static  int[] twoSum(int[] nums, int target) {
        int flag=1;
        for(int i=0;i<nums.length;i++){
            for(int j = flag;j<nums.length;j++){
                System.out.println(i+" "+j);
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
            flag=flag+1;


        }
        return new int[]{};
    }*/
    // 使用哈希表，可以将寻找 target - x 的时间复杂度降低到从 O(N)O(N) 降低到 O(1)O(1)
    public  static  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            //使用map k-v 结构
            //如果存在该key则说明两者相等
            if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                //直接把值存为key用户后续的比较
                map.put(nums[i], i);


        }
        return new int[]{};
    }

}
