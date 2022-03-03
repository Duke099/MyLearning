package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class A18_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the num: ");
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5); // Here <Integer> -> is used not int and <> -> This can be ignored but it good practice to use it.


////Program 1 - Printing array using ArrayList
//        // input
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        // get item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i) + " "); // pass index here, list[index] syntax will not work here
//        }
//        System.out.println();
//        System.out.println(list);

////Program 2 - printing MultiDimentional Array using ArrayList:
//
////        Program Initialization
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
////        System.out.println(list); //To check what above function is doing
//        //add elements
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(in.nextInt());
//            }
//        }
//        System.out.println(list);

    }
}
