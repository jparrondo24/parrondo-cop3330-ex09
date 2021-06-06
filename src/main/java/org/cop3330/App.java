/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    static final double SQUAREFEET_PER_GALLON = 350.0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the ceiling? ");
        int length = in.nextInt();
        System.out.print("What is the width of the ceiling? ");
        int width = in.nextInt();

        int squareFeet = length * width;
        int numGallonsNeeded = (int) Math.ceil(squareFeet / SQUAREFEET_PER_GALLON);
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n",
                           numGallonsNeeded, squareFeet);
    }
}
