package com.example.day01;

import java.util.concurrent.*;

/**
 * Thread createMethod
 *    1. 继承Thread
 *    2. 实现Runnable
 *    3. 实现Callable
 *
 * Thread 和Runnable的区别：
 *    由于java支持单继承，继承Thread是只能继承Thread，但实现Runnable接口，还可以继承其他类，影响只是覆盖了基本的run方法
 *    继承Thread类无法实现重用，实现Runnable可以运行可以多种方式运行，如还支持Executor方式
 *    Thread是继承，Runnable是组合和拓展的思想。
 *Callable
 *
 */

public class ThreadCreateMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //继承Thread方式
        ExtendThread extendThread =new ExtendThread();
        new Thread(extendThread).start();
        new Thread(extendThread).start();
        new Thread(extendThread).start();
        //实现Runnable接口方式
        ImplRunnable implRunnable=new ImplRunnable();
        new Thread(implRunnable).start();
        new Thread(implRunnable).start();
        new Thread(implRunnable).start();
        //实现callable
        ImplCallable implCallable =new ImplCallable();
        FutureTask future=new FutureTask(implCallable);
        new Thread(future,"t1").start();
        new Thread(future,"t2").start();
        //支持回调
        System.out.println(future.get());
        ExecutorService executorService=Executors.newScheduledThreadPool(8);
        executorService.submit(future);
        executorService.shutdown();







    }

}
class ExtendThread extends Thread{
    private int num=100;
    @Override
    public void run() {
        /***
         * 存在超卖问题
         * */
        System.out.println("继承Thread类方法");
        while(num>0){
            if(num>0){
                num--;
                System.out.println(num);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                break;
            }
        }
    }
}
class ImplRunnable implements Runnable{
    private int num=100;
    private int num1=0;
    @Override
    public void run() {
        /***
         * 存在超卖问题
         * */
        System.out.println("实现Runnable");
        while(true){
           if(num>0){
               num--;
               num1++;
               System.out.println(Thread.currentThread().getName()+num+" "+num1);

           } else{
               break;
           }

        }
    }


}
class ImplCallable implements Callable<String>{
    private int num=100;
    private int num1=0;
    @Override
    public String call() throws Exception {
        /***
         * 不存在超卖问题
         * */
        System.out.println("实现callable");
        while(true){
            if(num>0){
                num--;
                num1++;
                System.out.println(num+","+num1);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                break;
            }

        }
        return "执行完毕";
    }
}
