package com.brownj;

public class ArrayStringSort {

    private String[] myString;
    private int count;
    private int maxIndex;

    public ArrayStringSort(int maxIndex){
        this.maxIndex = maxIndex;
        myString = new String[this.maxIndex];
        count = 0;
    }

    public void addStrings(String stringToAdd){

        if(count == maxIndex){
            count = 0;
        }
        else{
            myString[count] = stringToAdd;
            count++;
        }

    }

    public void sortStringArray(){
        for(int i = 0; i < maxIndex; i++){

            for(int x = 0; x < maxIndex; x++){
                if(myString[i].compareTo(myString[x])<0){
                    String temp = myString[x];
                    myString[x] = myString[i];
                    myString[i] = temp;

                }
                }
            }
        }


    public void printStringArray(){
        for(int i = 0; i < maxIndex; i++){
            System.out.println(i+": "+myString[i]);
        }
    }
}
