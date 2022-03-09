package com.company;

import java.util.Arrays;

// In Func. overloading two func. of same name can be called with the help of "type" of value passed
public class A13_FunctionOverloading {
    public static void main(String[] args) {
//      if there is no reference function for any of these calling class then it will give error.
//        fun(); //This will give error bcz it gets confused which reference function to choose
        fun("Thor","Marvel");
        fun(10,20,30,40);
        fun("Thor");
        fun(25);
        int message = fun(55,89);
        System.out.println(message);

    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
    static void fun(String ...neww) {
        System.out.println(Arrays.toString(neww));
    }
    static void fun(int ...b) {
        System.out.println(Arrays.toString(b));
    }
    static int fun(int x, int y) {
        int sum = x+y;
        return sum;
    }

}
