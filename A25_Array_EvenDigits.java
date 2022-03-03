package com.company;
//Q: Find how many numbers contains even digits.
public class A25_Array_EvenDigits {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896,14};
        System.out.println(total(num));
        System.out.println(even(75550));
        System.out.println(digit(-1));

    }
    static int total(int[] num) {
        int count = 0;
//        for (int i = 0; i < num.length; i++) { // Old form
//          if (even(num[i])) {   //Old form
        for (int j : num) { //Enhanced form
            if (even(j)) {  //enhanced form
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {

        int numb = digit(num);
        if (numb % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digit(int num) {
        if (num<0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num>0) {
            count++;
            num = num/10;
        }
        return count;
    }


}
