public class MaximumSubArray {

    public int maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = 0;
            sum = sum + arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum = sum + arr[j];

                if(sum>maxSum) maxSum = sum;

                System.out.println("i= "+i+",j= "+j+",arr[i]= "+arr[i]+",arr[j]="+arr[j]+",sum="+sum+",maxSum="+maxSum);
            }
        }
        return maxSum;
    }
}
