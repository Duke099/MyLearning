package com.company;
import java.util.Scanner;
public class A7_Functions_2_StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet() {
        System.out.println("Enter any string: ");
        Scanner in = new Scanner(System.in);
        String greeting = in.nextLine();
        return greeting;
    }
}
