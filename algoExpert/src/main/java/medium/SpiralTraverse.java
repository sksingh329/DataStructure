package medium;

import java.util.ArrayList;
import java.util.List;

/*
Write a function that takes in an n*m two-dimensional array
(that can be square-shaped when m==n) and returns one-
dimensional array of all the arrays's elements in spiral order.

Spiral order starts at the top left corner of the two-
dimensional array, goes to the right, and proceeds in a
spiral pattern all the way until every element has been
visited.

Sample Input: array = [
[1,2,3,4],
[12,13,14,5],
[11,16,15,6],
[10,9,8,7]]

Sample output:
[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
 */
public class SpiralTraverse {
    public List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        int startRow = 0, endRow = array.length-1;
        int startCol = 0, endCol = array[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            for(int col = startCol;col<=endCol;col++)
                result.add(array[startRow][col]);
            for(int row = startRow+1;row<=endRow;row++)
                result.add(array[row][endCol]);
            for(int col=endCol-1;col >= startCol; col--)
                result.add(array[endRow][col]);
            for(int row=endRow-1;row > startRow; row--)
                result.add(array[row][startCol]);
            startRow +=1;
            endRow -= 1;
            startCol +=1;
            endCol -= 1;
        }
        return result;
    }
}
