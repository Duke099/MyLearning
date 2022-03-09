package com.company;

public class A30_Binarry_FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 1;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //My code using Binary loop
    static int floor(int[] arr, int target) {
        //what if target is less than the smallest number of array
        if (target < arr[0]) {
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
        return end;
        //we are returning end because if you calculate while loop on paper you will find that at the end (if target = 11) then start = 12, end = 10;
        // start becomes greater than end and while loop breaks.
    }
}
