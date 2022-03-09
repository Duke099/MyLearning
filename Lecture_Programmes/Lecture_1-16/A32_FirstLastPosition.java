package com.company;

import java.util.Arrays;

//Q: First and Last position of sorted array.
public class A32_FirstLastPosition {
    public static void main(String[] args) {
        //Value for leetcode
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));



//        //Value for my code
//        int[] arr = {5,7,7,7,7,8,8,8,10};
//        int target = 8;
//        int ans1 = starting(arr,target);
//        int ans2 = ending(arr, target);
//        System.out.println(ans1 + ", " + ans2);

    }

    //Leetcode answer 34
    static int[] searchRange(int[] arr, int target) {
        int [] ans = {-1, -1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1 ;
            }
            else  {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


//    //My code using Binary loop
//    static int starting(int[] arr, int target) {
//        //what if target is less than the smallest number of array
//        if (target < arr[0]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length -1;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//
//            if (arr[mid] == target) {
//                end = mid - 1;
//            }
//            else if (target < arr[mid]) {
//                end = mid - 1 ;
//            } else  {
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
//    static int ending(int[] arr, int target) {
//        //what if target is less than the smallest number of array
//        if (target < arr[0]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length -1;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//
//            if (arr[mid] == target) {
//                start = mid + 1;
//            }
//            else if (target < arr[mid]) {
//                end = mid - 1 ;
//            } else  {
//                start = mid + 1;
//            }
//        }
//        return end;
//    }











}