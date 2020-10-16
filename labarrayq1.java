package com.strathextra;

import java.util.Scanner;

public class labarrayq1 {
    public static void main(String[] args) {

        String[] beverage = {"Fanta", "Johnnie Walker"};
        int[] price = {60, 300};
        String[] type = {"Soft", "Alcoholic"};
        int choice = 0;

        while (true){
            System.out.println("Enter a beverage index as follows for the given beverages: ");
            for (int i=0;i<2;i++){
                System.out.println(i + ": "+ beverage[i]);
            }
            System.out.print("- ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (choice==0 || choice==1){
                break;
            }

        }
        System.out.println(beverage[choice] + " is a " + type[choice] + " drink, and costs Ksh." + price[choice] + " .Thus 3 bottles of " +
                beverage[choice]+" would cost " + (3 * price[choice]));
    }
}
