package com.company;

import java.util.Scanner;

public class A0_4_If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 10000) {
            salary += 2000;
        } else if (salary < 10000) {
            salary += 1000;
        } else salary += 1500;
        System.out.println(salary);
    }
}

