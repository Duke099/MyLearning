package com.company;

public class A28_1_OrderAgnosticBinarySearch_RubbishCode { //here array is sorted but order(Ascending or Descending) is unknown to the user.
    public static void main(String[] args) {
        int[] arr = {-10,-2,15,26,38,44,54,78,114,156,236,345,389};
        int target = 54;//Ascending
//        int[] arr = {80, 70, 60, 50, 40, 30, 20, 10, 1, -10, -20, -30, -40};//Descending
//        int target = 1;//Descending
        //To know whether the order is ascending or descending then we compare first & last nummbers.
        //What if many number repeats and the two numbers you choose happens to be the same numbers thats why first and last.
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target) {
        int Startposition = 0;
        int endposition = arr.length - 1;
        int start = arr[0];
        int end = arr[arr.length - 1];
        int mid = Startposition + (endposition - Startposition) / 2;

        while (Startposition <= endposition) {
            if (end > start) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
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
