/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution14 {
    /*
        get order amount fUser
        get state fUser
        check if state is WI
            -if true
            out -subtotal
            out -tax
            out -total
            if false
            out- total
     */
    public static void main(String[] args) {
        double total, tax;
        String state;
        final double rate = 0.055;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        total = input.nextDouble();
        System.out.println("What is the state? ");
        state = input.next();

        if(state.equals("WI"))
        {
            System.out.println("The subtotal is $" + String.format("%.2f", total));
            tax = total * rate;
            System.out.println("The tax is $" + String.format("%.2f", tax));
            total += tax;
            System.out.println("The total is $" + String.format("%.2f", total));
            System.exit(0);
        }
        System.out.println("The total is $" + String.format("%.2f", total));
    }
}
