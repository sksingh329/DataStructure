package medium;

import java.util.Arrays;
import java.util.List;

public class MoveElmentToEndTest {
    public static void main(String[] args) {
        Integer[] array = {2,1,2,2,2,3,4,2};
        List<Integer> inputArray = Arrays.asList(array);
        //List<Integer> output= MoveElementToEnd.moveElementToEnd(inputArray,2);
        List<Integer> output= MoveElementToEnd.moveElementToEnd2(inputArray,2);
        for(int i : output)
            System.out.println(i);
    }
}
