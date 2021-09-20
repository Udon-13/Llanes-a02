/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution17 {
    /*
        staggered do while loops
        get gender
        get alcohol oz
        get weight
        get timeFromDrink
        parse int for all ^^
            after prompt, check if numeric
            not- redo

        calculate based on
        m or f - use ternary<>
        out BAC and approval
     */

    public static String promptUser(int count)
    {
        String temp;
        temp = "Error, doesn't = any case #";
        temp = switch (count) {
            case 1 -> "Enter a 1 if you are male or a 2 if you are female:";
            case 2 -> "How many ounces of alcohol did you have?";
            case 3 -> "What is your weight, in pounds?";
            case 4 -> "How many hours has it been since your last drink?";
            default -> temp;
        };
        return temp;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gender=0, ozAlcohol=0, weight=0, timeWaited=0, check;
        final double MALE_RATIO = 0.73, FEMALE_RATIO = 0.66;
        double bac, genWeigh;
        String result, garbage;

        for(int i =1; i<5;i++)
        {
            check = 0;
            do
            {
                System.out.println(promptUser(i));
                if(input.hasNextInt())
                {
                    switch (i)
                    {
                        case 1: gender = input.nextInt();
                        break;
                        case 2: ozAlcohol = input.nextInt();
                        break;
                        case 3: weight = input.nextInt();
                        break;
                        case 4: timeWaited = input.nextInt();
                    }
                    check =1;
                }
                else
                {
                    garbage = input.nextLine();
                }
            }while(check == 0 || (gender !=1 && gender !=2));
        }

        bac = (ozAlcohol * 5.14);
        bac /= weight;
        bac *= gender ==1? MALE_RATIO:FEMALE_RATIO;
        bac -=(0.015 * timeWaited);

        System.out.println("Your BAC is " + String.format("%.6f", bac));
        if(bac>=0.08)
        {
            System.out.println("It is not legal for you to drive");
        }
        else
        {
            System.out.println("It is legal for you to drive");
        }

    }
}
