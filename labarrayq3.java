package com.strathextra;

import java.util.Scanner;

public class labarrayq3 {

    public static void main(String[] args) {

        System.out.print("Enter the number of seconds: ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds/60;
        int hours = minutes/60;
        seconds = seconds%60;
        minutes = minutes%60;

        String hourf = String.format("%02d",hours);
        String minutef = String.format("%02d",minutes);
        String secondf = String.format("%02d",seconds);

        System.out.println(hourf + ":" + minutef + ":" + secondf);
    }
}
