package com.company;

import java.util.Scanner;

public class A23_FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {15,65,35,40,85,90,20,3,5,1};
//        System.out.println("Enter multiple of 5 to know its position: ");
        int ans = min(arr);

        System.out.println(ans);

//        Q:Does this number exists;
    }
     // Finding minimum
    static int min(int[] arr) {
        int ans = arr[0];
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element < ans ){
                ans = element;
            }
        }
        return ans;
    }

}