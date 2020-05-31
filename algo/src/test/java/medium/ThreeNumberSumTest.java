package medium;

import java.util.List;

public class ThreeNumberSumTest {
    public static void main(String[] args) {
        int[] arr={-8,-6,1,2,3,5,6,12};
        ThreeNumberSum sum = new ThreeNumberSum();
        List<Integer[]> output = sum.findSum(arr,50);
        for (Integer[] out: output) {
            System.out.println(out[0]+","+out[1]+","+out[2]);
        }
    }
}
