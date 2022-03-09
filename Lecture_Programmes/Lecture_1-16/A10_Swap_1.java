package com.company;

import java.util.Arrays;


public class A10_Swap_1 {
//    Below I'm writing two value swap programs; 1-String'2-Array 3- Int
//    string couldn't be swapped due to some java security reasons and if you change whole string then its not swap but new creation
//    but array could be swapped

//    Program 1-String -> Its couldn't swap the String.
//    public static void main(String[] args) {
//        String name = "Thor";
//        change(name);
//        System.out.println(name);
//    }
//    static void change(String naam) {
//        naam = "The God of Thunder";
//    }

//  Program-2 Array -> It's clearly swapping the number.

//    public static void main(String[] args) {
//        int[] arr = {1, 55, 85, 95, 45, 100};
//        change_2(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void change_2(int[] nums) {
//        nums[0] = 99; // if you make change to the object via this ref. variable, same object will be change.
//    }

//    Program-3.1 Int -> Here is the example how swapping doesn't work in Int.
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int sum = a+b;
//        swap(a, b);
//        System.out.println(a);
//    }
//    static int swap(int num1, int num2) {
//        int numX = num1;
//        num1 = num2;
//        num2 = num1;
////        System.out.println(marks);
//        return num1;
//
//    }

//    Program-3.2 Int -> Here is the example how swapping work in Int.

    public static void main(String[] args) { // Because this thing is also a block so everything initilized here would be available everywhere;
        int a=10;
        int b=20;
        int sum = a+b;
        System.out.println(a); // Here the value doesn't change

//        Block scope -> under {} -> here whatever value is declared can't be declared again but the value which is already declared can be used here and also the value could be changed. which is also called swapped
//        for eg if int a= 10 then u can change value like->(a=55) but not like->(int a=35) // In simple word value declared outside this block cant be declared again but new value declared in this block will remain in this block and cant be used outside.
//        Its so easy to swap anything here. Even string could be swapped.
        {
            int c = 100;
            a=85;
        }
        int c = 50; // See 'c' could be initialized again despite being initialized inside that upper block.
        System.out.println(a); // Here the value is changed

    }


}
