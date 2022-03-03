package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class A15_Array_String {
    public static void main(String[] args) {
        System.out.println("Enter the words: ");
        Scanner in = new Scanner(System.in);
//        String array
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));

        arr[2] = "Dr. Strange";
        arr[1] = "Spider Man";
        System.out.println(Arrays.toString(arr));


// Below is just to show string

//        String[] arr = new String[4];
//        System.out.println(arr[2]); // Empty String shows null
////        System.out.println(arr[25]); // number exceeeing array's length shows error.
    }
}
