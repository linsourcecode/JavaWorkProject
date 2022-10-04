package com.example.stack;
/***
 * 递归的准则：
 * 互不影响，各自独立的
 * 必须可以结束
 *
 * 实现迷宫回溯
 * */
public class recursionDemo {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //上下置为1
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;

        }
        //左右置为一
        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;

        }

        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        getway(map,1,1);
        System.out.println("******************");
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean getway(int[][] map, int i, int j){
        if(map[6][5] ==2){
            return true;
        }else{
            if(map[i][j]==0){
                map[i][j]=2;

                if(getway(map, i-1,j)){
                    return  true;
                } else if (getway(map,i,j+1)) {
                     return  true;
                } else if (getway(map,i+1,j)) {
                    return  true;
                } else if (getway(map,i+1,j-1)){
                     return true;
                } else {
                 map[i][j]=3;
                 return  false;

                }


            }else{
                return  false;
            }
        }


    }
}
