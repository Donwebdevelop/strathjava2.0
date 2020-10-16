package com.strathextra;

import java.util.Scanner;

public class exerciseq3 {

    public static void main(String[] args) {

        System.out.print("Enter the number of the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        String [] days_of_week ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        switch (day){
            case "1":
                System.out.println(days_of_week[0]);
                break;
            case "2":
                System.out.println(days_of_week[1]);
                break;
            case "3":
                System.out.println(days_of_week[2]);
                break;
            case "4":
                System.out.println(days_of_week[3]);
                break;
            case "5":
                System.out.println(days_of_week[4]);
                break;
            case "6":
                System.out.println(days_of_week[5]);
                break;
            case "7":
                System.out.println(days_of_week[6]);
                break;
            default:
                System.out.println("Invalid date");
                break;
        }
    }
}
