package com.example;
/**
* 给你一个字符串 s，找到 s 中最长的回文子串。
*
*
* 输入：s = "babad"
  输出："bab"
 解释："aba" 同样是符合题意的答案。
*
* */
public class Demo005 {
    public static void main(String[] args) {

    }
    //使用中心扩散原理
    public String longestPalindrome(String s) {
        if(s.length()==0||s==null) return "";
        int strLen = s.length();
        int left = 0;
        int right = 0;
        int len = 1;
        int maxStart = 0;
        int maxLen = 0;
        for (int i = 0; i < strLen; i++) {
            left = i - 1;
            right = i + 1;

            //向左扩散 以0为起点 如果左边与0相等
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            //向右扩散 以0为起点 如果右边与0相等
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            //判断左右是否相等，如果相等且left不等于一，right小于数组长度
            while (left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)) {
                len = len + 2;
                left--;
                right++;
            }
            //设置回文子串的最大的长度以及最左字符串
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);





    }
}
