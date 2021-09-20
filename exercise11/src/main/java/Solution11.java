/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution11 {
    /*
        get amount from user = euro
        get rate from user
        print amount and rate
        get exchange/round to nearest cent
     */
    public static void main(String[] args) {
        double c_to, c_from, rate;
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging? ");
        c_from = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        rate = input.nextDouble();
        System.out.println(c_from + " euros at an exchange rate of " + rate + " is");

        c_to = c_from * rate;
        c_to = 0.01 * Math.ceil(c_to * 100);
        System.out.println(String.format("%.2f", c_to) + " U.S. dollars.");
    }
}
