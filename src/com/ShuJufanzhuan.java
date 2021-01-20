package com.day07.shuzu;

public class ShuJufanzhuan {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5,};
        for (int star = 0,end=arr.length-1; star<end; star++,end--) {
            int temp=arr[star];
            arr[star]=arr[end];
            arr[end]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
