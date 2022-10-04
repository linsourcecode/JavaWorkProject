package day02;

public class ClassLock {
    public static void main(String[] args) throws InterruptedException {
        LockDemo01 lockDemo01=new LockDemo01();

        LockDemo01 lockDemo02=new LockDemo01();
       new Thread(()->{
            try {
                lockDemo01.staicMethod();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                lockDemo02.staicMethod();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                lockDemo02.staicMethod();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("----获取值----------");
        new Thread(()->{

                lockDemo01.addNumMthod02();


        }).start();
        new Thread(()->{

            System.out.println(LockDemo01.getNum101());

        }).start();

    }

    }


class LockDemo01<staic> {
    static int num=100;
    //synchronized 锁住整个类，多个类实例都会被锁住
    public synchronized static void staicMethod() throws InterruptedException {

           System.out.println(Thread.currentThread().getName()+"进入休眠");
           Thread.sleep(100);
           System.out.println(Thread.currentThread().getName()+"停止休眠，释放锁");}
    //单纯的静态方法无法锁住类
    public  static int  getNum() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"获取值");
        Thread.sleep(100);
        num+=1;
        System.out.println(Thread.currentThread().getName()+"返回值"+num);
        return num;
    }
    /***synchronized锁住对象的实例,只能保证在变量在一个对象里的安全性
     * */
    public  synchronized int  addNumMthod() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"获取值");
        Thread.sleep(100);
        num+=1;
        System.out.println(Thread.currentThread().getName()+"返回值"+num);
        return num;
    }
    /** static 存在安全问题
     * */
    public static int  addNumMthod02(){
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"获取值");
            num+=1;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(Thread.currentThread().getName()+"返回值"+num);
        return num;
    }
    static final int getNum101(){
        num=num+1;
        return num;
    }

}
 class lockDemo02{

}