package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek_String = scanner.nextLine();
        int dayOfWeek = Integer.parseInt(dayOfWeek_String);
            if(dayOfWeek==1) {
                System.out.println("Saturday");}
            if(dayOfWeek==2) {
                System.out.println("Sunday");
            }
            if(dayOfWeek==3) {
                System.out.println("Monday");
            }
            if(dayOfWeek==4) {
                System.out.println("Thursday");
            }
            if(dayOfWeek==5) {
                System.out.println("Wednesday");
            }
            if(dayOfWeek==6) {
                System.out.println("Tuesday");
            }
            if(dayOfWeek==7) {
                System.out.println("Friday");
            }
            else {
                System.out.println("please inter current number");
            }
        }
    }
}
