package medium;

/*
Write a function that takes in two non-empty arrays of integers. The functions should find the pair
of numbers(one from the first array, one from the second array) whose absolute difference is
closest is zero. The function should return an array containing these two numbers, with the number
from the first array in the first position. Assume that there will only be one pair of numbers
with the smallest difference.

Sample input:[-1,5,10,20,28,3],[26,134,135,15,17]
Sample output:[28,26]
 */
public class SmallestDifference {

    public static int[] smallestDifference2(int[] arrayOne, int[] arrayTwo){
        int firstElem = arrayOne[0];
        int secondElem = arrayTwo[0];
        int minDifference = Integer.MAX_VALUE;
        int i =0, j=0;
        while(i<arrayOne.length && j<arrayTwo.length){
            System.out.println("i="+i+"arrayOne[i]="+arrayOne[i]);
            System.out.println("j="+j+"arrayTwo[i]="+arrayTwo[j]);
            int difference = Math.abs(arrayOne[i]-arrayTwo[j]);
            if(difference<minDifference){
                minDifference = difference;
                firstElem = arrayOne[i];
                secondElem = arrayTwo[j];
            }
            if(arrayOne[i]<arrayTwo[j]) i++;
            else if(arrayOne[i]>arrayTwo[j]) j++;
            else break;
        }
        int[] output = {firstElem,secondElem};
        System.out.println(firstElem+","+secondElem);
        return output;
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo){
        int firstElem = arrayOne[0];
        int secondElem = arrayTwo[0];
        int minDifference = Integer.MAX_VALUE;
        for(int i=0;i<arrayOne.length;i++){
            for(int j=0;j<arrayTwo.length;j++){
                int difference = Math.abs(arrayOne[i]-arrayTwo[j]);
                if(difference<minDifference){
                    minDifference = difference;
                    firstElem = arrayOne[i];
                    secondElem = arrayTwo[j];
                }
            }
        }
        int[] output = {firstElem,secondElem};
        System.out.println(firstElem+","+secondElem);
        return output;
    }
}


