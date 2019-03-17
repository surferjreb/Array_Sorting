package com.brownj;

public class ArrayNumberSort {

    private int[] numbers;
    private int numberIndex;
    private int count;

    public ArrayNumberSort(int numberIndex){

        this.numberIndex = numberIndex;
        numbers = new int[this.numberIndex];
        count = 0;

    }

    public void sortArray(){

        int temp;
        int mynumber;
        for(int i = 0; i < numberIndex; i++){

            for(int x = 0; x < numberIndex; x++){
                if (numbers[i] < numbers[x]) {
                    temp = numbers[x];
                    numbers[x] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

    }

    public void printArray(){

        for(int i = 0; i < numberIndex; i++){
            System.out.println((i+1)+": "+numbers[i]);

        }

    }

    public void enterNumbers(int number){

       if(count == numberIndex) count = 0;


        if(count < numberIndex)
        {
            numbers[count] = number;
            count++;
        }
        else{
            System.out.println("Array is full");
        }


    }
}
