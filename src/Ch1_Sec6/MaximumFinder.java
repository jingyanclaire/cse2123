package Ch1_Sec6;

import java.util.Scanner;
/*
Define a method findMaximum() with a Scanner parameter that reads integers from input until a negative integer is read. The method returns the largest of the integers read.
Ex: If the input is 50 45 20 -65 -5 -70 -30, then the output is: 50
 */
public class MaximumFinder {
    /* Your code goes here */
    public static int findMaximum(Scanner scnr){
        int result = 0;
        int highestNum = 0;
        while (result >= 0){
            result = scnr.nextInt();
            if(result >= highestNum){
                highestNum = result;
            }
        }
        return highestNum;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int maxVal;

        maxVal = findMaximum(scnr);

        System.out.println(maxVal);
    }
}
