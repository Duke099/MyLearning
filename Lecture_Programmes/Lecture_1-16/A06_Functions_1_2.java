package com.company;
/* This Function program is same as previous Function_1
Every Function its own This scanner value --> Scanner in = new Scanner(System.in);
 */
import java.util.Scanner;
public class A06_Functions_1_2 {

    public static void main(String[] args) {
        int ans = sum_1();
        System.out.println(ans);
    }

    static int sum_1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number 1: ");
        int a = in.nextInt();
        System.out.println("Enter two number 2: ");
        int b = in.nextInt();
        int sum = a * b;
        return sum;

    }

}
