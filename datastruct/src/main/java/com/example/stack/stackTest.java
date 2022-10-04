package com.example.stack;
/**
 * 复习数据结构栈结构
 * 特点：先入先出
 * 思路：使用数组
 *
 *
 * */
class ArrayStack{
    private int maxSize;
    private int[] stack;
    //防止越界
    private int top=-1;
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack=new int[maxSize];

    }
   public boolean isFull(){
        if((top-1)==maxSize){
            return  true;
        }else{
            return  false;
        }

   }
   public void push(int num){
        if(isFull()){
            System.out.println("栈是满的");
            return;
        }else{
            top++;
            stack[top] = num;
            System.out.println(top);

        }
   }
   public int  pop() throws Exception {
        if(top==-1){

            throw  new Exception("栈为空");
        }
        int value = stack[top];
        top--;
        return value;
   }
   public void list() throws Exception {


        if(top==-1){

           throw  new Exception("栈为空");
        }
        for(int i=top;i>=0;i--){

           System.out.println(stack[i]);
        }



   }

}
public class stackTest {
    public static void main(String[] args) throws Exception {
        ArrayStack arrayStack=new ArrayStack(10);
        //arrayStack.add(13);
        arrayStack.push(12);
        arrayStack.push(12);
        arrayStack.list();
    }
}
