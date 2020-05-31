package medium;

import java.util.ArrayList;
import java.util.List;

/*
    Write a function that takes in a non-empty array of distinct integers and an integer
    representing a target sum. The function should find all triplets in the array that
    sum up to the target sum and return a two-dimensional array of all these objects. The
    numbers in each triplet should be ordered inn ascending order, and the triplet themselves
    should be ordered in ascending order with respect to the numbers the hold. If no three
    numbers sum up to the target sum, the function should return an empty array.

    Sample Input: [12,3,1,2,-6,5,-8,6],0
    Sample output: [[-8,2,6],[-8,3,5],[-6,1,5]]
 */
public class ThreeNumberSum {

    public List<Integer[]> findSum(int[] arr, int targetSum){
        int left,right;
        List<Integer[]> triplets = new ArrayList<Integer[]>();
        int[][] empty = {{0,0}};
        for(int i=0;i<arr.length;i++){
            left = i+1;
            right = arr.length -1;
            int currentNumber = arr[i];
            while(left<right){
                int currentSum = currentNumber+arr[left]+arr[right];
                if(currentSum == targetSum){
                    Integer[] newTriplet = {currentNumber,arr[left],arr[right]};
                    triplets.add(newTriplet);
                    //System.out.println(currentNumber+","+arr[left]+","+arr[right]);
                    left++;
                    right--;
                }
                else if(currentSum>targetSum) right--;
                else left++;
            }
        }
        return triplets;
    }
}
