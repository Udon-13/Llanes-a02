/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        int pplCount, pizzaAmnt, pizzaSlice, leftovers, diviPizza;
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        pplCount = input.nextInt();
        System.out.println("How many pizzas do you have?");
        pizzaAmnt = input.nextInt();
        System.out.println("How many slices per pizzas?");
        pizzaSlice = input.nextInt();
        pizzaSlice *= pizzaAmnt;
        System.out.println(pplCount + " people with " + pizzaAmnt + " pizzas (" + pizzaSlice + " slices)");

        leftovers = pizzaSlice%pplCount;
        diviPizza = pizzaSlice/pplCount;
        System.out.println("Each person gets " + diviPizza + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");




    }
}
