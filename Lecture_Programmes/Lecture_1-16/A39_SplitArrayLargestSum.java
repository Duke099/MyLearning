package com.company;

//Q:(11-Video-15) ((Q-410-Leetcode))
//https://leetcode.com/problems/split-array-largest-sum/
public class A39_SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
        int m = 2;
        int ans = splitarray(arr, m);
        System.out.println(ans);
    }
    
    static int splitarray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);//To find biggest number in array
            end += arr[i]; //To find sum of all array
            
        }

        while (start < end) {
            int mid = start + (end -start) /2;

            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
