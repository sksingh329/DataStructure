package medium;

/*
You're given an array of integers and an integer. Write a function that moves all instances of
that integer in the array to the end of the array and returns the array. The function should
perform this in place(i.e. it should mutate the input array) and doesn't need to maintain the
order of the other integers.

Sample Input: [2,1,2,2,2,3,4,2]
to move: 2

Sample output: [1,3,4,2,2,2,2,2]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd2(List<Integer> inputArray,int move){
        Integer[] array = inputArray.toArray(new Integer[0]);
        int left = 0, right = array.length-1;
        while(left<right){
            if(array[left]==move && array[right]!=move){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }else if(array[right] == move) right--;
            else if(array[left] != move) left++;
        }
        return Arrays.asList(array);
    }
    public static List<Integer> moveElementToEnd(List<Integer> inputArray,int move){
        Integer[] array = inputArray.toArray(new Integer[0]);
        Integer[] output = new Integer[array.length];
        int left=0,right=array.length-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==move) {
                output[right] = array[i];
                right--;
            }
            else{
                output[left]=array[i];
                left++;
            }
        }
        return Arrays.asList(output);
    }
}
