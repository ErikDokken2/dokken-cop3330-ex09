package exercises.ex09;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */

public class ex09 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex09 example09 = new ex09();

        int length = 15;
        int width = 10;
        int coverGal = 350;

        int squareFeet = example09.squareFeet(length, width);
        int amountGal = example09.galNeeded(squareFeet, coverGal);


        //Output
        String outputString = example09.outputString(squareFeet, amountGal);
        example09.printOutput(outputString);

    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String outputString(int squareFeet, int amountGal) {
        return "You will need to purchase " + amountGal + " gallons of paint to cover " + squareFeet + " square feet.";
    }

    private int galNeeded(int squareFeet, int coverGal) {
        if(squareFeet % coverGal == 0)
        {
            return squareFeet / coverGal;
        }
        else
            return  (squareFeet / coverGal) + 1;
    }

    private int squareFeet(int length, int width) {
        return length * width;
    }

}