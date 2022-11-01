package com.example;

import java.util.*;

public class Demo003 {
    public static void main(String[] args) {
        int abcabcbb = lengthOfLongestSubstring(" ");
        System.out.println(abcabcbb);
    }

    /**
     * 较为朴素的写法,存在时间超时问题
     * @param s
     * @return
     */
    /*public static int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        char[] chars=s.toCharArray();
        Set set =new HashSet();
        int num=0;
        boolean flag=true;
        for(int i=0;i<chars.length;i++){
            set.add(chars[i]);

            System.out.println("进入循环**********"+set.size());
            for(int j=i+1;j<chars.length;j++){


                if (set.contains(chars[j])) {
                    //System.out.println("++++++");

                    //System.out.println(num);

                  break;


                }


                System.out.println(set.add(chars[j]));
                System.out.println(chars[j]+" "+set.size());
            }
            if(num<=set.size()){
                num = set.size();
                System.out.println("赋值"+num+set.size());
                set.clear();
            }

            set.clear();
            System.out.println("set集合大小 "+set.size());


        }
        return num;


    }*/
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                //map.get(s.charAt(i)) + 1把位置向前移动一位，避免重复计算
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            //i-left+1 取最新的一段的区间大小
            max = Math.max(max,i-left+1);
        }
        return max;

    }



}
