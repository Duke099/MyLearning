package com.company;

//Q:(9-Video-15)

public class A38_RotationCountRBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = count(arr);
        System.out.println(ans);
    }
    static int count(int[] arr) {
        int pivot = findpivot(arr);
        //If there is no rotations then -1+1 becomes 0
        return pivot+1;
        }

    //use this for non-duplicates
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while(start < end) {
            int mid = start + (end-start)/2;
            //mid < end -- to counter index bound error
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && mid < end && arr[mid] < arr[mid-1]) {
                return mid -1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid -1;
            }
            else {
                start = mid+1;
            };
        }
        return -1;

    }

//    //use this for duplicates
//    static int findpivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//
//        while(start < end) {
//            int mid = start + (end-start)/2;
//            //mid < end -- to counter index bound error
//            if (mid < end && arr[mid] > arr[mid+1]) {
//                return mid;
//            }
//            if (mid > start && arr[mid] < arr[mid-1]) {
//                return mid -1;
//            }
//            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                if (arr[start] > arr[start + 1]) {
//                    return start;
//                }
//                start++;
//
//                if (arr[end] < arr[end - 1]) {
//                    return end-1;
//                }
//                end--;
//            }
//            else if (arr[start] < arr[mid] || arr[start] == arr[mid]) {
//                start = mid+1;
//            } else {
//                end = mid -1;
//            }
//
//        }
//        return end;
//
//    }
}
