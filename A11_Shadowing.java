package com.company;

public class A11_Shadowing {
    static int x = 10; // This will be shadowed for line 9, 10,14.-> which means value for these lines woud be changed.

    public static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x); // This will not work bcz int x is declared in line 8 but not initialized.
        x=40;
        System.out.println(x); // This will be shadowed for line 10,14.
        fun();
        {
            x = 50;
        }
        System.out.println(x);
    }
    static void fun() {
        int x = 30;
        System.out.println(x);
    }
}

