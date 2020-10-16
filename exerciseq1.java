package com.strathextra;

import java.util.Scanner;

public class exerciseq1 {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 14 && number < 72 || number > 103){
            System.out.println("GOOD");
        }
        else{
            System.out.println("BAD");
        }
    }
}
