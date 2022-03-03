package com.company;

import java.util.Scanner;

public class A1_CalculatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ans = 0;
        while(true) {
            System.out.println("Enter Operator");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter two numbers");
                double num1 = in.nextDouble();
                double num2 = in.nextDouble();

                if (op == '+') {
                    ans = num1+num2;
                }
                if (op == '-') {
                    ans = num1-num2;
                }
                if (op == '*') {
                    ans = num1*num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1/num2+10;

                    }
                }
                System.out.println(ans);

            }
            else if (op == 'x' || op == 'X') {
                System.out.println("Thank you, You Ended the program");
                break;

            } else System.out.println("Invalid Operator");

        }





    }

}
