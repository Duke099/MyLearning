package com.company;

//Q: (Q-852/Q:162--LeetCode)--Find peak in mountain array
//It is sorted but 1st half is sorted in ascending and 2nd half is sorted in descending.
public class A34_MountainArrayPeakIndex {
    public static void main(String[] args) {
        int[] arr = {3,4,8,9,45,41,37,29,19,12};
        int ans = find(arr);
        System.out.println(arr[ans]);
    }
    static int find(int[] arr) {
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
