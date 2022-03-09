package com.company;

import java.util.Arrays;

public class A12_VarArgs {
//    Multiple

//    public static void main(String[] args) {
//        Multiple( "Captain",10,45,20,30);
//    }
//    // Its variable length arguments-> Use String, int, char anything then use ...v or any variable ...x; It will take it as array of string or int or char etc
//    static void Multiple(String a, int ...b)  { // Variable length arg. always comes in the end.
////        Kunal dint tell how to print this
//    }

//  String program -> start here

    public static void main(String[] args) {
        fun("IronMan", "Thor", "Captain", "Hulk", "Dr_Strange");
    }

    static void fun(String ...a)  { // Its variable length arguments-> Use String, int, char anything then use ...v or any variable ...x; It will take it as array of string or int or char etc
        System.out.println(Arrays.toString(a));
    }


//    Int Program -> Start Here

//    public static void main(String[] args) {
//        fun(25, 56, 89, 10, 20, 30, 50);
//    }
//
//    static void fun(int ...a)  { // Its variable length arguments-> Use String, int, char anything then use ...v or any variable ...x; It will take it as array of string or int or char etc
//        System.out.println(Arrays.toString(a));
//    }

}
