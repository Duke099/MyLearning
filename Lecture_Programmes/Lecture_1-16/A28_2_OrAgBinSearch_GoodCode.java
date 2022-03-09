package com.company;

public class A28_2_OrAgBinSearch_GoodCode {
    public static void main(String[] args) {
//        int[] arr = {-10,-2,15,26,38,44,54,78,114,156,236,345,389};//Ascending
        int[] arr = {70,60,50,40,30,20,10,1,-10,-20,-30,-40};//Descending
//        int target = 54;//Ascending
        int target = 1;//Descending
        int ans = search(arr, target);
        System.out.println(ans);

    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

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
}
