package com.company;

import java.util.Locale;
import java.util.Scanner;

public class A4_NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID");
        int empID = in.nextInt();
        String Department= in.next().toUpperCase(Locale.ROOT);

// Toggle with Alt+ENTER
        switch (empID) {
            case 1 -> System.out.println("Smith");
            case 2 -> System.out.println("Brad");
            case 3 -> {
                System.out.println("Thomas ");
                switch (Department) {
                    case "IT" -> System.out.println("Software");
                    case "MD" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter Valid ID");
        }
    }
}

