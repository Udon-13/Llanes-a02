/*
 *  UCF COP3330 Fall 2021 Assignment # Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution23 {
    /*
        inf loop
        switchcase inside loop change num based on answer
        end of a case have exit
     */


    public static void main(String[] args) {
        String answer;
        int num = 1, count =0;
        Scanner input = new Scanner(System.in);

        do
        {
            switch (num)
            {
                case 1:
                    System.out.print("Is the car silent when you turn the key? ");
                    answer = input.next();
                    num = answer.equals("y") || answer.equals("Y")? 2 : 3;
                    break;
                case 2:
                    System.out.print("Are the battery terminals corroded? ");
                    answer = input.next();
                    num = answer.equals("y") || answer.equals("Y")? 4 : 5;
                    break;
                case 3:
                    System.out.print("Does the car make a slicking noise? ");
                    answer = input.next();
                    num = answer.equals("y") || answer.equals("Y")? 7 : 8;
                    break;
                case 4:
                    System.out.print("Clean terminals and try starting again.");
                    System.exit(0);
                    break;
                case 5:
                    System.out.print("Replace cables and try again.");
                    System.exit(0);
                    break;
                case 6:
                    System.out.print("Check to ensure the choke is opening and closing.");
                    System.exit(0);
                    break;
                case 7:
                    System.out.print("Replace the battery.");
                    System.exit(0);
                    break;
                case 8:
                    System.out.print("Does the car crank up but fail to start? ");
                    answer = input.next();
                    num = answer.equals("y") || answer.equals("Y")? 9 : 10;
                    break;
                case 9:
                    System.out.print("Check spark plug connections.");
                    System.exit(0);
                    break;
                case 10:
                    System.out.print("Does the engine start and then die? ");
                    answer = input.next();
                    num = answer.equals("y") || answer.equals("Y")? 11 :12 ;
                    break;
                case 11:
                    System.out.print("Does your car have fuel injection? ");
                    answer = input.next();
                    num = answer.equals("y") || answer.equals("Y")? 13 : 6;
                    break;
                case 12:
                    System.out.print("This should not be possible.");
                    System.exit(0);
                    break;
                case 13:
                    System.out.print("Get it in for service.");
                    System.exit(0);
                    break;
            }
        }while(count ==0);
    }
}
