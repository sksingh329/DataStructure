package medium;

import java.util.List;

public class SpiralTraverseTest {
    public static void main(String[] args) {
        SpiralTraverse spiralTraverse = new SpiralTraverse();
        int[][] input = {{1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
        };
        List<Integer> output = spiralTraverse.spiralTraverse(input);
        for(Integer elem:output)
            System.out.println(elem);
    }
}
