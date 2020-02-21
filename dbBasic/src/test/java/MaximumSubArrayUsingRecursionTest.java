public class MaximumSubArrayUsingRecursionTest {
    public static void main(String[] args) {
        MaxSubArrayUsingRecursion maximumSubArray = new MaxSubArrayUsingRecursion();
        int[] arr = {-2,-5,6,-2,-3,1,5,-6};
        int maxSum = maximumSubArray.findMaximumSubArray(arr,0,arr.length-1);
        System.out.println("Maximum continuous sum in array is: "+maxSum);

        System.out.println("Recording is on");
    }
}
