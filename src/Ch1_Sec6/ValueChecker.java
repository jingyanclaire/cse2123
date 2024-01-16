package Ch1_Sec6;

import java.util.Scanner;
/*
Define a method checkValues() with a Scanner parameter that reads integers from input until 0 is read. The method returns true if all integers read before 0 are negative. Otherwise, the method returns false.
Ex: If the input is -25 -75 -45 0, then the output is: All true
 */
public class ValueChecker {
    /* Your code goes here */
    public static boolean checkValues(Scanner scnr){
        int result = -1;
        while(result != 0){
            result = scnr.nextInt();
            if(result > 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean allNegative;

        allNegative = checkValues(scnr);
        if (allNegative) {
            System.out.println("All true");
        }
        else {
            System.out.println("Not all true");
        }
    }
}
