package com.strathextra;

import java.util.Arrays;

public class labarrayq5 {

    public static int[] arraysorter(int[] given_array){
        Arrays.sort(given_array);
        int maximum = given_array[given_array.length-1];
        int minimum = given_array[0];
        int difference = given_array[given_array.length-1] - given_array[0];
        int [] values = {maximum, minimum, difference};
        System.out.println("Maximum   : " + maximum);
        System.out.println("Minimum   : " + minimum);
        System.out.println("Difference: " + difference);
        return values;
    }

    public static void main(String[] args) {

        int [] array_one = {71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
        int [] array_two = {23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};

        arraysorter(array_one);
        System.out.println();
        arraysorter(array_two);



    }
}
