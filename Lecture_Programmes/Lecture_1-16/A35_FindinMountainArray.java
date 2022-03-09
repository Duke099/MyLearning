package com.company;

//Q:5 - Video- 15(Q-1095--LeetCode)-- Find in Mountain Array
//To submit in leetcode we need to knoe OOP.
//It is sorted but 1st half is sorted in ascending and 2nd half is sorted in descending.
public class A35_FindinMountainArray {
    public static void main(String[] args) {
        //Values for My Code
        int[] arr = {1,2,3,4,5,3,2,1};
        int target = 3; //Answer should be index = 2
        int ans = find(arr, target);
        System.out.println(ans);

    }
    //Good Code
    static int find(int[] arr, int target) {
        int end = arr.length - 1;
        int peak = findInMountainArray(arr);
        int firstTry = orderAgnosticBinarysearch(arr, target,0,peak);
        if (firstTry != -1 ) {
            return firstTry;
        }
        return orderAgnosticBinarysearch(arr,target,peak+1,end);
    }

    static int orderAgnosticBinarysearch(int[] arr, int target, int start, int end) {

        //boolean to check array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];//Same code but contracted form

//        boolean isAsc;
//        if (arr[start]<arr[end]) {
//            isAsc = true;
//        } else{
//            isAsc = false;
//        }
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1 ;
                } else  {
                    start = mid + 1;
                }

            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

//    //My code
//    static int find(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length -1;
//        int peak = findInMountainArray(arr);
//        int peak2 = peak;
//
//        while(start <= peak) {
//            int mid = start + (peak-start)/2;
//            if (target < arr[mid]) {
//                peak = mid - 1 ;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            }else {
//                return mid;
//            };
//        }
//        while(peak2 <= end) {
//            int mid = peak2 + (end-peak2)/2;
//            if (target < arr[mid]) {
//                end = mid - 1 ;
//            } else if (target > arr[mid]) {
//                peak2 = mid + 1;
//            }else {
//                return mid;
//            };
//        }
//        return -1;
//    }

    static int findInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while(start < end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }else {
                start = mid+1;
            };
        }
        return start;
    }
}
