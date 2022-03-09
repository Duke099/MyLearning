package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A16_PassinginFuntion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] num) {
        num[2] = 85;
    }
}
