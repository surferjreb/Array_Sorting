package com.brownj;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStringSort myStringArray;
        String myString;
        int count;
        int maxIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("How many words do you want to enter?: ");
        maxIndex = input.nextInt();
        myStringArray = new ArrayStringSort(maxIndex);
        input.nextLine();
        System.out.println();
        System.out.println("Enter your words: ");

        for(int i = 0; i < maxIndex; i++){
            myString = input.nextLine();
            myStringArray.addStrings(myString);
            System.out.println();
        }

        System.out.println("Before the sort: ");
        myStringArray.printStringArray();
        System.out.println();
        myStringArray.sortStringArray();
        System.out.println("After bubble sort");
        myStringArray.printStringArray();

    }
}
