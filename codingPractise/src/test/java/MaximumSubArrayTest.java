public class MaximumSubArrayTest {

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] arr = {-2,-5,6,-2,-3,1,5,-6};
        int maxSum = maximumSubArray.maxSubArray(arr);
        System.out.println("Maximum continuous sum in array is: "+maxSum);
    }
}
