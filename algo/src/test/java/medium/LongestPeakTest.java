package medium;

public class LongestPeakTest {

    public static void main(String[] args) {
        LongestPeak longestPeak = new LongestPeak();
        int[] array = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        int length = longestPeak.longestPeak(array);
        System.out.println(length);
    }
}
