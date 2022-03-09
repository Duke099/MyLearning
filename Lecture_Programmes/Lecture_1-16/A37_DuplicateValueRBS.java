package com.company;

//Q:(9-Video 15)
public class A37_DuplicateValueRBS {
    public static void main(String[] args) {

        int[] arr = {1,1,2,1,2,2,2,2,5,7,1,1};
        int target = 2;
        System.out.println(findpivot(arr));
        System.out.println(search(arr, target));
        System.out.println(arr.length-1);
    }
    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);

        if (pivot == -1) {
            //just do normal binary search
            return binary(nums, target, 0, nums.length -1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binary(nums, target, 0, pivot -1);
        }

        return binary(nums, target,  pivot+1, nums.length -1);
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


    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while(start < end) {
            int mid = start + (end-start)/2;
            //mid < end -- to counter index bound error
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid -1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end-1;
                }
                end--;
            }
            else if (arr[start] < arr[mid] || arr[start] == arr[mid]) {
                start = mid+1;
            } else {
                end = mid -1;
            }

        }
        return end;

    }

}
