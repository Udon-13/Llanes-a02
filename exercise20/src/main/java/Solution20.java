/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution20 {
    /*
        get amount
        get state
        get county
        check state
            -WI wiTax
            -check county
                -EC ECTAX
                -Dunn DTAX
            -IL ilTax
        out tax + total
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax = 0, total = 0;
        final double WI_TAX = 0.05, IL_TAX = 0.08, EC_TAX = 0.005, DUNN_TAX = 0.004;
        String state, county;

        System.out.println("What is the order amount?");
        total = input.nextDouble();
        System.out.println("What state do you live in?");
        state = input.next();
        System.out.println("What county do you live in?");
        input.nextLine();
        county = input.nextLine();

        if(state.equals("Wisconsin"))
        {
            tax = total * WI_TAX;
            if(county.equals("Eau Claire"))
            {
                tax += total * EC_TAX;
            }
            else if(county.equals("Dunn"))
            {
                tax += total * DUNN_TAX;
            }
            total += tax;
        }
        else if(state.equals("Illinois"))
        {
            tax = total * IL_TAX;
            total += tax;
        }

        tax = 0.001 * (Math.ceil(tax*1000));
        total = 0.001 * (Math.ceil(total*1000));

        System.out.println("The tax is $" + String.format("%.2f", tax) + ".\nThe total is $"+ String.format("%.2f", total) + ".");
    }
}
