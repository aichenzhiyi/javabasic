package com.czy;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("输入数组长度:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0;i<length;i++){
            System.out.println("输入第"+(i+1)+"个值:");
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);

        int tempNum = 1;
        int maxNum = 1;
        int num = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]==array[i-1]){
                tempNum++;
                if (tempNum>maxNum){
                    maxNum=tempNum;
                    num=array[i-1];
                }
            }else {
                tempNum=1;
            }
        }

        if ((maxNum*2)>array.length){
            System.out.println(num);
        }else {
            System.out.println(-1);
        }
    }
}
    