package medium;

import java.util.Arrays;

public class SmallestDifferenceTest {

    public static void main(String[] args) {
        int[] arrayOne = {10,1000,9124,2142,59,24,596,591,124,-123};
        int[] arrayTwo = {-1441,-124,-25,1014,1500,660,410,245,530};
        //int[] arrayOne = {-1,5,10,20,28,3};
        //int[] arrayTwo = {26,134,135,15,17};
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        //SmallestDifference.smallestDifference(arrayOne,arrayTwo);
        SmallestDifference.smallestDifference2(arrayOne,arrayTwo);
    }
}
