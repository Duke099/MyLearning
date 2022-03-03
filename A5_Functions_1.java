package com.company;
// Methods and functions are same things.
/*
whatever we write between these two star slash would be considered as comment
so here we study about functions.
when '()' is used after class variable it becomes function.
there is
1.Pass the function.
2.Call the function.
 */
import java.util.Scanner;

public class A5_Functions_1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number 1: ");
        int a = in.nextInt();
        System.out.println("Enter two number 2: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum of the nummbers: " + sum);
    }

}



