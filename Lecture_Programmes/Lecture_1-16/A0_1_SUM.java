package com.company;

import java.util.Scanner;

public class A0_1_SUM {
    public static void main(String[] args) {
        System.out.print("Enter the no. here :");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        float Sum = n1 + n2;
        System.out.println("This is the new no." + Sum);

    }
}
