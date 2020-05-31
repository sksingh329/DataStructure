package medium;

import jdk.jfr.StackTrace;

public class MonotonicArrayTest {
    public static void main(String[] args) {
        int[] array = {-1,5,-10,-1100,-1101,-1102,-9001};
        boolean isMonotonic = MonotonicArray.isMonotonic(array);
        System.out.println(isMonotonic);
    }
}
