package com.company;

import java.util.Arrays;

//Q:(1-Video-16)
//how to eliminate row & column to search any number in matrix
public class A40_2DArray_Binary {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix , int target) {
        int r = 0;
        int c = matrix.length- 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};

            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
