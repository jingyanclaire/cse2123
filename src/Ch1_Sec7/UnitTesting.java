package Ch1_Sec7;

public class UnitTesting {
    public static int cubeNum(int origNum) {
        return origNum * origNum * origNum;
    }
    public static void main (String [] args) {
        System.out.println("Testing started");
        System.out.println("2, expecting 8, got: " + cubeNum(2));
        /* Your code goes here */
        assert (cubeNum(3) == 27) :"Assertion (cubeNum(3) == 27) failed";
        assert (cubeNum(-1) == -1) :"Assertion (cubeNum(-1) == -1) failed";
        System.out.println("Testing completed");
    }
}
