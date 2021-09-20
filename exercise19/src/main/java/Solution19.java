/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution19 {
    /*
        get height and weight
            test for numeric
        calculate bmi (w/(h*h))*703
        if low - doctor
        if right - gg
        if high - doctor
     */
    public static void main(String[] args) {
        String temp, doctor = "You should see your doctor.";
        double weight=0, height=0, bmi;
        final int CONSTANT = 703;
        Scanner input = new Scanner(System.in);

        int check =0;
        do {
            System.out.println("What is your height?");
            if(input.hasNextDouble())
            {
                height = input.nextDouble();
                check =1;
            }
            else
            {
                temp = input.nextLine();
            }
        }while(check == 0);

        check = 0;
        do {
            System.out.println("What is your weight?");
            if(input.hasNextDouble())
            {
                weight = input.nextDouble();
                check =1;
            }
            else
            {
                temp = input.nextLine();
            }
        }while(check == 0);

        bmi = (weight/(height*height)) * CONSTANT;
        System.out.println("Your BMI is " + String.format("%.1f", bmi) + ".");
        if(bmi>=25)
        {
            System.out.println("You are overweight. "  + doctor);
        }
        else if(bmi<=18.5)
        {
            System.out.println("You are underweight. " + doctor);
        }
        else
        {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
