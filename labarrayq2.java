package com.strathextra;

import java.sql.DataTruncation;
import java.text.DecimalFormat;
import java.util.Arrays;

public class labarrayq2 {
    public static void main(String[] args) {

        double [] student_marks = new double[10];
        double sum = 0;

        for(int i=0;i<10;i++){
            student_marks[i] = Math.round(Math.random() * 100);
        }

        for (int i=0;i<student_marks.length;i++){
            sum += student_marks[i];
        }
        double average = sum/student_marks.length;
        System.out.println("Student marks: "+ Arrays.toString(student_marks));
        System.out.println();

        System.out.println("The sum of the student marks is: " + sum);
        System.out.println("The average of student marks is: " + average);
    }
}
