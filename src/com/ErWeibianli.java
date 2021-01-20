package com.day07.shuzu;

public class ErWeibianli {
    public static void main(String[] args) {
        int[][]arr= {{1,2},{3,4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 //可以写个有需求可以定义变量代替  int Tmpe=arr[i][j];
                System.out.println(arr[i][j]);
            }

        }
    }
}
