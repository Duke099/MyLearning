package com.company;

import java.util.Scanner;

public class A03_Switch_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        There are many switch programs in this and toggle every program between old and enhanced view.

//        This is 1st program

//        System.out.println("Enter no. for Week days:");
//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter Valid number");
//                break;
//
//        }

//        Below is the 2nd program

        System.out.println("Enter no. for Week days:");
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekened");
                break;
            default:
                System.out.println("Enter Valid number");
                break;
        }



    }
}
