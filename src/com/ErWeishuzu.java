package com.day07.shuzu;

import java.sql.SQLOutput;

public class ErWeishuzu {
    public static void main(String[] args) {
        int [][] arr=new int[][]{
                                  {11,22},// 0索引
                                  {33,44}// 1索引
                                    };
        System.out.println(arr[0]);//[I@1540e19d
        System.out.println(arr[1]);//[I@677327b6
        System.out.println(arr[0][1]);
    }
}
