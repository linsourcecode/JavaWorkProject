package com.example.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 前缀表达式 先将前两个数字弹入栈，遇到符号就出栈 3+4 -》 + 3 4
 * 后缀表达式（逆波兰表达式) 如 （3+4）*5 =》 3 4 + 5 *
 *
 *
 *
 *自定义逆波兰表达式
 *
 * **/
public class stackdemo {
    public static void main(String[] args) {
        //定义字符串
        String suffix ="3 4 +  ";

        int res = cal(split(suffix));
        System.out.println(res);
    }
    //将数据和运算符放入字符串
    public static List<String> split(String suffix){
        String[] arrary = suffix.split(" ");
        List list = new ArrayList<String>();
        for(String ele:arrary){
            list.add(ele);
        }
        return list;

    }
    //逆波兰计算
    public  static int cal(List<String> list){
        Stack<String> stack=new Stack();
        for(String item:list){
               if(item.matches("\\d+")){
                      stack.push(item);

               }else{
                   int num1 = Integer.parseInt(stack.pop());
                   int num2 = Integer.parseInt(stack.pop());
                   int res =0 ;
                   if(item.equals("+")){
                       res = num1 +num2;
                   }
                   stack.push(""+res );

               }
        }
        String info = stack.pop();
        return  Integer.parseInt(info);}
}
