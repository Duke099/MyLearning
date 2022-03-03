package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A22_SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the end range: ");
        int[] arr = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
        int end = in.nextInt();
        int target = in.nextInt();
        System.out.println("Enter multiple of 5 to know its position: ");
        int ans = linearsearch(arr, target, 1, end );
        System.out.println(ans);

//        Q:Does this number exists;
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0 ){
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
