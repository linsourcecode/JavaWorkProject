package com.example.day01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Method2{
    public static void main(String[] args) {
        ImplCallable2 implCallable =new ImplCallable2();
        FutureTask future=new FutureTask(implCallable);
        FutureTask future2=new FutureTask(implCallable);
        new Thread(future,"t1").start();
        new Thread(future2,"t2").start();

    }
}
class ImplCallable2 implements Callable<String> {
    private int num=100;
    private int num1=0;
    @Override
    public String call() throws Exception {
        /***
         * 不存在超卖问题
         * */
        System.out.println("实现callable方法一");
        while(true){
            if(num>0){
                num--;
                num1++;
                System.out.println(Thread.currentThread().getName()+","+num+","+num1);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                break;
            }

        }
        return null;
    }
}

