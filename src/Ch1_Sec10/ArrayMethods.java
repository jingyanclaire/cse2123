package Ch1_Sec10;

import java.util.Scanner;
/*Four integers are read from input and stored into the array myArray. Write a static method subtractIndexFromElements() that takes an integer array parameter and replaces each element with the difference between the element and the element's index.
Ex: If the input is 55 60 25 30, then the output is:
Old array: 55 60 25 30
New array: 55 59 23 27
 */
public class ArrayMethods {
    /* Your code goes here */
    public static void subtractIndexFromElements(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] -= i;
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
        final int NUM_MEMBERS = 4;
        int[] myArray = new int[NUM_MEMBERS];
        int i;
        int userNum;
        for (i = 0; i < myArray.length; ++i) {
            myArray[i] = scnr.nextInt();
        }
        System.out.print("Old array: ");
        printArr(myArray);
        subtractIndexFromElements(myArray);
        System.out.print("New array: ");
        printArr(myArray);
    }
}
