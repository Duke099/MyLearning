package com.company;

import java.util.Arrays;

//Q: If the array is infinity then we can not use .length function.
//Q: Kunal (Video:15, Q:5)
//If the arrray is sorted apply binary search no matter how big the lengt of the array is.
//We can't use infity array so we are mimicing it by not using .length.
public class A33_InfinityArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;// Our array is limited not infinite so dont take target above 90 or else it increasethe chunk of array whic we dont have.
        System.out.println(ans(arr, target));
        
    }
    static int ans(int[] arr, int target) {
        //first find the range
        //first start with a chunk of size 2 then increasing it by logarithmic value - we will keep doubling the size -(2,4,8,16,32,64,128)
        int start = 0;
        int  end = 1;

        //This while loop is doubling the value.
        while (target > arr[end]) {
            int temp = end + 1; //newStart is taken bcz we have to use start at below statement.
            end = end + (end - start + 1) * 2; //here start is used
            start = temp;

        }
        return binary(arr, target, start ,end);
    }


    static int binary(int[] arr, int target, int start, int end){

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
