package com.example.algorithm;

import java.util.Scanner;

/**
 * 吃桃子：
 *
 *
 * */
public class demo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int total=0;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int day=scanner.nextInt();
            int k = scanner.nextInt();
            total=k+total;
            System.out.println(total);


        }
        System.out.println(total);

    }
}
