package com.example.stack;
/***
 * 八皇后问题
 *
 * **/
public class queendemo {
    int[] array = new int[8];
    int max = 8;
    int count =0;

    public static void main(String[] args) {
        queendemo queendemo=new queendemo();
        queendemo.check(0);
        System.out.println(queendemo.count);


    }
    private void check(int n){
        if(n== max){
            print();
            return;

        }
        for(int i=0;i<max;i++){
            array[n] = i;
            if(jude(n)){
                check(n+1);//不冲突}
            }
        }
    }

    /**
     * 判断是否冲突了
     * */
    private boolean jude(int n){
        for(int i=0;i<n;i++){
            //array[i]==array[n] 不在同一列
            // Math.abs(n-i)==Math.abs(array[n]-array[i]) 不在同一个斜线
            if(array[i]==array[n]|| Math.abs(n-i)==Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return  true;
    }
    private void print(){
        count++;

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
