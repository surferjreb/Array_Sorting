package com.brownj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numberIndex;
        int number;
        ArrayNumberSort myArray;
        boolean quit = false;
        String answer;
        Scanner input = new Scanner(System.in);

        while(!quit) {
            System.out.print("How many numbers do you want to enter?: ");
            numberIndex = input.nextInt();
            myArray = new ArrayNumberSort(numberIndex);

            for (int i = 0; i < numberIndex; i++) {
                System.out.print("Enter your numbers: ");
                number = input.nextInt();
                myArray.enterNumbers(number);
                System.out.println();
            }
            System.out.println("Before bubble sort");
            myArray.printArray();
            myArray.sortArray();
            System.out.println("After bubble sort");
            myArray.printArray();
            input.nextLine();

            System.out.println("Do you want to try again?(y/n): ");
            answer = input.nextLine();
            if(answer.equalsIgnoreCase("n")){

                System.out.println("Thank for giving it a whirl!");
                System.out.println("Have a great day!");
                quit = true;

            }
            else{

                quit = false;

            }//End if statement
        }//End while loop
    }

}
