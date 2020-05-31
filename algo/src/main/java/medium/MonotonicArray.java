package medium;

/*
Write a function that takes in an array of integers and returns a boolean representing whether
the array is monotonic.

An array is said to be monotonic if its element from left to right are entirely non-increasing
or entirely non-decreasing.

Sample Input: [-1,-5,-10,-1100,-1101,-1102,-9001]
Sample Output: true
 */
public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        int i=0;
        boolean flag= true;
        int pattern = 0;
        while(i<array.length-1){
            if(array[i] == array[i+1]) i++;
            else if(pattern == 0){
                if(array[i+1]>array[i])pattern=1;
                else pattern = -1;
            }
            else{
                if(array[i+1]>array[i] && pattern == 1) i++;
                else if(array[i+1]<array[i]&& pattern == -1) i++;
                else{
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
