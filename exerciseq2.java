package com.strathextra;

import java.util.Scanner;

public class exerciseq2 {

    public static void main(String[] args) {
        System.out.println("Choose between the following 5 beverages: ");
        String [] beverages = { "Coke", "Water" , "Fanta" , "Novida" , "Juice"};

        for (int i=0;i<5;i++){
            System.out.println((i+1)+". " + beverages[i]);
        }
        System.out.print("- ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice){
            case "1":
                System.out.println("You have chosen " + beverages[0]);
                break;
            case "2":
                System.out.println("You have chosen " + beverages[1]);
                break;
            case "3":
                System.out.println("You have chosen " + beverages[2]);
                break;
            case "4":
                System.out.println("You have chosen " + beverages[3]);
                break;
            case "5":
                System.out.println("You have chosen " + beverages[4]);
                break;
            default:
                System.out.println("Error Choice was not valid, here is your money");

        }

    }
}
