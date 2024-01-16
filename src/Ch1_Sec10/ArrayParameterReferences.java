package Ch1_Sec10;

import java.util.Scanner;
/*
Six integers are read from input and stored into the array myArray. Write a static method arrayPositionSwap() that takes an integer array parameter and swaps the first element with the second element of the array.
Ex: If the input is 10 20 75 65 55 95, then the output is:
Initial array: 10 20 75 65 55 95
Final array: 20 10 75 65 55 95
 */
public class ArrayParameterReferences {
    /* Your code goes here */
    public static void arrayPositionSwap(int[] arr){
        int a = arr[0];
        arr[0] = arr[1];
        arr[1] = a;
    }
    public static void printArr(int[] arr) {
        int i;

        for (i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEM = 6;
        int[] myArray = new int[NUM_ELEM];
        int i;
        int userNum;
        for (i = 0; i < myArray.length; ++i) {
            myArray[i] = scnr.nextInt();
        }
        System.out.print("Initial array: ");
        printArr(myArray);
        arrayPositionSwap(myArray);
        System.out.print("Final array: ");
        printArr(myArray);
    }
}
