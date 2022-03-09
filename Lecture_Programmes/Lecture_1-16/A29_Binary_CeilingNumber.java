package com.company;
//Q: Find Ceiling; Ceiling = number greater or equal to target.

public class A29_Binary_CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 23;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    //My code using Binary loop
    static int ceiling(int[] arr, int target) {

        //what if target is greater than the greatest number of array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;


        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
                if (target < arr[mid]) {
                    end = mid - 1 ;
                } else  {
                    start = mid + 1;
                }
        }
        return start;
        //we are returning start because if you calculate while loop on paper you will find that at the end (if target = 11) then start = 12, end = 10;
        // start becomes greater than end and while loop breaks.
    }

//    //My Code using for loop
//    static int ceiling(int[] arr,int target){
//        for (int i = 0; i < arr.length; i++) {
//            int ceiling = arr[i];
//            if (ceiling >= target) {
//                return ceiling;
//            }
//        }
//        return -1;
//    }









}
