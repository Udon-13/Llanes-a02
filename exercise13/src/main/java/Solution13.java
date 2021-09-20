/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution13 {
    /*
        get principal fUser
        get interest fUser
        get years fUser
        get compound fUser
        a = p(1+(r*t))
     */
    public static void main(String[] args) {
        double principal, rate, amount;
        int compound, years;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount? ");
        principal = input.nextDouble();
        System.out.println("What is the rate? ");
        rate = input.nextDouble();
        System.out.println("What is the number of years? ");
        years = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year? ");
        compound = input.nextInt();

        rate /= 100;
        amount = principal * Math.pow((1+(rate/compound)), (years * compound) );
        rate *=100;
        amount = 0.01 * (Math.ceil(amount*100));
        System.out.println("$" + String.format("%.2f", principal) + " invested at " + String.format("%.1f", rate) + "% for " + years + " years compounded " + compound + " times per year is $" + String.format("%.2f", amount) + ".");

    }
}
