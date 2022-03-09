package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class A24_SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][]; //trying on my own...not relevant
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,8},
                {9,10,171,12},
                {15,14,13,18}
        };
//        int target = 13;//Search program-1
//        int[] ans = search(arr, target); //Search program-1
//        System.out.println(Arrays.toString(ans)); //Search program-1

//        System.out.println(maxV(arr)); //Program -2

        System.out.println(minV(arr));//Program -3|
    }

//     //Program -1| Finding target in 2D array
//    static int[] search(int[][] arr , int target) {
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] == target) {
//                    return new int[]{row,col};
//                }
//
//            }
//
//        }
//        return new int[0];//if the input value is not from array
//    }

//    //Program -2| Finding maximum in 2D Array
//    static int max(int[][] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int[] ints : arr) {
//            for (int element : ints) {
//                if (element > max) {
//                    max = element;
//                }
//            }
//
//        }
//        return max;
//    }

    //Program -3| Finding minimum value in 2D Array
    static int minV(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }

            }

        }
        return min;
    }




}
