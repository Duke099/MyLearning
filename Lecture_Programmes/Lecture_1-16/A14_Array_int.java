package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A14_Array_int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q.Store a roll number
        int a = 19;

        //Q:Store a name
        String name = "Thor";

        //Q: Store 5 roll. number
        //Ans:Use some data structures to store 5 RN.

        int[] rnos = new int[2]; // "new":- It used to create the new objects;
        System.out.println("Enter number: ");
//        System.out.println(rnos[2]); // Empty int shows 0
//        System.out.println(rnos[25]); // number exceeeing array's length shows error.

//        This for loop takes value as input.
        for (int i = 0; i < rnos.length; i++) { //rnos.length means it will run till the length of array which is 5
            rnos[i] = in.nextInt();
        }
//        This for loop print all the 5 value taken by upper loop.
        for (int i = 0; i < rnos.length; i++) {
            System.out.print(rnos[i] + " ");
        }
        System.out.println(" ");

        for (int num : rnos) {  // for every element in array, print the element
            System.out.print(num + "  "); // here num represents element of the array
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(rnos)); // Best & Easiest way to print array

    }
}
