package Ch1_Sec10;

import java.util.Scanner;
/*
Four integers are read from input and stored into the array arrayToModify. Then, numCompare is read from input. Write a static method modifyArray() that takes an integer array parameter and an integer parameter. For each element in the array, if the element is greater than or equal to the integer parameter, then replace the element with 0. Otherwise, replace the element with 1.
Ex: If the input is:
15 40 55 5
28
then the output is:
Input array: 15 40 55 5
Output array: 1 0 0 1
 */
public class ArrayParameterReferences1 {
    /* Your code goes here */
    public static void modifyArray(int[] arr, int numCompare) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= numCompare) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
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
        final int NUM_HOURS = 4;
        int[] arrayToModify = new int[NUM_HOURS];
        int i;
        int numCompare;
        for (i = 0; i < arrayToModify.length; ++i) {
            arrayToModify[i] = scnr.nextInt();
        }
        numCompare = scnr.nextInt();
        System.out.print("Input array: ");
        printArr(arrayToModify);
        modifyArray(arrayToModify, numCompare);
        System.out.print("Output array: ");
        printArr(arrayToModify);
    }
}
