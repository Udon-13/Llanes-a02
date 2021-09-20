/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution18 {
    /*
        info + prompt for temp
        check what conversion
        convert
        output temp converted
     */
    public static void main(String[] args) {
        double temp=0;
        String choice, tempString= "ERROR";
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour Choice: ");
        choice = input.next();


        if(choice.equals("c") || choice.equals("C"))
        {
            tempString = "Celsius";
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = input.nextDouble();
            System.out.println(temp);
            temp = (temp - 32) * 5/9;
        }
        else if(choice.equals("f")||choice.equals("F"))
        {
            tempString = "Fahrenheit";
            System.out.print("Please enter the temperature in Celsius: ");
            temp = input.nextDouble();
            temp = (temp * 9/5) + 32;
        }

        System.out.println("The temperature in " + tempString + " is " + String.format("%.1f", temp) + ".");
    }
}
