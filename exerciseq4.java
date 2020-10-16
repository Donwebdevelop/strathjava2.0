package com.strathextra;

public class exerciseq4 {

    public static void main(String[] args) {
        int x = 12;
        while (x<30){
            while (x % 2 ==0){
                System.out.println(x);
                break;
            }
            x++;
            continue;
        }
    }
}
