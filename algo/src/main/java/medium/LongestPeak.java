package medium;
/*
Write a function that takes in array of integers and returns the length of the longest peak in the array.

A peak is defined as adjacent integers in the array that are strictly increasing until they reach a tip (the highest
value in peak), at which point then become strictly decreasing. At least three integers are required to form peak.

For example, the integers 1,4,10,2 form a peak, but the integers 4,0,10 don't and neither do the integers 1,2,2,0.
Similarly, the integers 1,23, don't form peak because they aren't strictly decreasing integers after 3.

Sample Input: array = [1,2,3,3,4,0,10,6,5,-1,-3,2,3]

Sample Output: 6 // 0,10,6,5-1,-3
 */

public class LongestPeak {
    public int longestPeak(int[] array){
        int longestPeakLength = 0;
        int i = 1;
        while (i<array.length-1){
            boolean isPeak = array[i-1]<array[i] && array[i]>array[i+1];
            if(!isPeak) {
                i +=1;
                continue;
            }
            int leftIndex = i -2;
            while(leftIndex>=0 && array[leftIndex]<array[leftIndex+1])
                leftIndex -= 1;
            int rightIndex = i+2;
            while(rightIndex<array.length && array[rightIndex] < array[rightIndex-1 ])
                rightIndex +=1;

            int currentPeakLength =  rightIndex - leftIndex -1;
            if(currentPeakLength >longestPeakLength) longestPeakLength = currentPeakLength;
            i = rightIndex;
        }
        System.out.println(longestPeakLength);
        return longestPeakLength;
    }
}
