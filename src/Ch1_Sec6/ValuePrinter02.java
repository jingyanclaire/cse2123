package Ch1_Sec6;

import java.util.Scanner;
/*
Define a method printVal() that takes two integer parameters and outputs the product of all negative integers starting with the first and ending with the second parameter. If no negative integers exist, product is 1. End with a newline. The method does not return any value.
Ex: If the input is -4 7, then the output is:24
 */
public class ValuePrinter02 {
    /* Your code goes here */
    public static void outputValue(int num1, int num2) {
        int result = 1;
        for (int i = num1; i < 0 && i <= num2; i++) {
                result *= i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        outputValue(num1, num2);
    }
}
