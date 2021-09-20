/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution12 {
    /*
        get principal fUser
        get interest fUser
        get years fUser
        a = p(1+(r*t))
     */
    public static void main(String[] args) {
        double principal, rate, years, amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        principal = input.nextDouble();
        System.out.println("Enter the rate of interest:");
        rate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        years = input.nextDouble();

        rate /= 100;
        amount = principal * (1+(rate * years));
        rate *=100;
        amount = 0.01 * (Math.ceil(amount*100));
        System.out.println("After " + years + " years at " + String.format("%.1f", rate) + "%, the investment will be worth $" + String.format("%.2f", amount) + ".");

    }
}
