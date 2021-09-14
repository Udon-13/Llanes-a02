/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    /*
        get user  age
        get user  retirement age
        get difference from ages
        state year, state retirement year
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int userAge, retireAge, timeSpan, retireYear, currentYear = cal.get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        userAge = input.nextInt();
        System.out.print("At what age would you like to retire? ");
        retireAge = input.nextInt();
        timeSpan = retireAge - userAge;
        retireYear = currentYear + timeSpan;

        System.out.println("You have "+ timeSpan + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear + ".");






    }
}
