package com.company;

import java.util.Scanner;

public class A20_LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter multiple of 5 to know its position : ");
        int[] arr = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
        int target = in.nextInt();
        int ans = linearsearch(arr, target);
        System.out.println(ans);

//        Q:Does this number exists;
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0 ){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
