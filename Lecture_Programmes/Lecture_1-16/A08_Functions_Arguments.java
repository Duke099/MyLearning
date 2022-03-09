package com.company;

import java.util.Scanner;

public class A08_Functions_Arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int ans = sum2(in.nextInt(),in.nextInt());
        System.out.println(ans);

    }
// Instead of using Scanner pass the value of numbers when you are calling the method
    static int sum2(int a , int b) {
        int sum = a + b;
        return sum;
    }


    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number 1: ");
        int a = in.nextInt();
        System.out.println("Enter two number 2: ");
        int b = in.nextInt();
        int sum = a * b;
        return sum;

    }

}
