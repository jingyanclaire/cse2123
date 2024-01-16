package Ch1_Sec6;

import java.util.Scanner;
/*
Define a method printVals() that takes two integer parameters and outputs all integers starting with the first and ending with the second parameter, each followed by a newline. The method does not return any value.

Ex: If the input is 1 4, then the output is:
1
2
3
4
 */
public class ValuePrinter01 {
    /* Your code goes here */
    public static void printVals(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        printVals(num1, num2);
    }
}