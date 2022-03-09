package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A21_SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the alphabet to know its position : ");
        String name = "Thor";
        char target = in.next().charAt(0);
//        System.out.println(search(name, target));//Program-1
        System.out.println(search2(name, target));//Program-2
        System.out.println(Arrays.toString(name.toCharArray()));  // General
//        System.out.println();

//        Q:Does this number exists; // Programme Type-1
    }
//    static boolean search(String str, char target) {
//        if (str.length() == 0 ) { //In string .length() is function while in Int its the variable
//            return false;
//        }
//
//        for (int index = 0; index < str.length(); index++) {
//            if(target == str.charAt(index)) {
//                return true;
//            }
//        }
//        return false;
//    }

//    Programme Type-2

    static boolean search2(String str, char target) {
        if (str.length() == 0 ) { //In string .length() is function while in Int its the variable
            return false;
        }

        for (char ch : str.toCharArray()) { //convert string to char array
            if (ch == target) {
                return true;
            }
        }
        return false;
    }






}
