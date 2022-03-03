package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A17_MultidimensionArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        Scanner in = new Scanner(System.in);

//        int[][] arr2D = new int[3][];// It is not necessary to define column.
//        int[][] arr2D = {
//                {1, 2, 3,12}, //0th index
//                {4, 5, 6}, // 1st index
//                {7, 8, 9,10,15} // 2nd index -> arr2D[2] = {7,8,9,10,15}
//        }

        int[][] arr2D = new int[3][3];
        System.out.println(arr2D.length); //no. of rows

        // input
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        //Output - 1
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + "  ");
            }
            System.out.println();
        }


        // Output - 2
        System.out.println(" ");
        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.println(Arrays.toString(arr2D[row]));
//            }
        }

        }
}
