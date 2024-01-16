package Ch1_Sec10;

import java.util.Scanner;
public class ScoreFinder {
    public static int findScore(int[] scoreVal) {
        int i;
        int returnVal = scoreVal[0];
        for (i = 0; i < scoreVal.length; ++i) {
            if (scoreVal[i] > returnVal) {
                returnVal = scoreVal[i];
            }
        }
        return returnVal;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_SCORE = 4;
        int[] quizScore = new int[NUM_SCORE];
        int i;
        int returnScore;
        for (i = 0; i < quizScore.length; ++i) {
            quizScore[i] = scnr.nextInt();
        }
        returnScore = findScore(quizScore);
        System.out.println(returnScore);
    }
}
