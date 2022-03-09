package com.company;

import java.util.Scanner;

public class A09_Fncs_Arg_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.nextLine();
        String message = greet(name);
        System.out.println(message);

    }
//    Whatever defined in the function could not be used outside the function. for.eg:if we give value to a=10,b=20 then these value could not be used outside the function until whole func. is called.
//    even we cant print the value of function outside.
    static String greet(String word) {
        String greeting = "Hello " + word;
        return greeting;
    }

}
