/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution21 {
    /*
        ask for a numer of the month
        check via switch
            1 =jan
            2=feb
            etc
        out month via string change in switch
     */
    public static void main(String[] args) {
        String month = "ERROR";
        Scanner input = new Scanner(System.in);
        int monthNum=0;

        System.out.print("Please enter the number of the month: ");
        monthNum = input.nextInt();

        switch (monthNum) {
            case 1 -> month = "January.";
            case 2 -> month = "February.";
            case 3 -> month = "March.";
            case 4 -> month = "April.";
            case 5 -> month = "May.";
            case 6 -> month = "June.";
            case 7 -> month = "July.";
            case 8 -> month = "August.";
            case 9 -> month = "September.";
            case 10 -> month = "October.";
            case 11 -> month = "November.";
            case 12 -> month = "December.";
        }

        System.out.println("The name of the month is " + month);
    }
}
