public class MaxSubArrayUsingRecursion {
    public int findMaxCrossingSubArray(int[] arr,int low,int mid,int high){
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for(int i=mid;i >= low; i--){
            sum =sum+arr[i];
            if(sum>leftSum)
                leftSum = sum;
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for(int i = mid+1;i<=high;i++){
            sum = sum + arr[i];
            if(sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }
    public int findMaximumSubArray(int[] arr, int low, int high){
        if(low == high) return arr[low];
        int mid = (low+high)/2;
        return Math.max(Math.max(findMaximumSubArray(arr,low,mid),
                findMaximumSubArray(arr,mid+1,high)),findMaxCrossingSubArray(arr,low,mid,high));
    }
}
