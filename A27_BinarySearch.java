package com.company;

public class A27_BinarySearch {
    public static void main(String[] args) {
        // Here the array is already sorted
        int[] arr = {-22,-15,-11,-7,-3,-1,0,1,15 ,22,31,36,41,48,51,59,60,65,70,100};
        int target = 41;
        int ans = binary(arr, target);
        System.out.println(ans);
    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1 ;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            };
        }
        return -1;
    }


}
