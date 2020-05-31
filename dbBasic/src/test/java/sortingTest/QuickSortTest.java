package sortingTest;

import sorting.QuickSort;

public class QuickSortTest {

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] input = {2,8,7,1,3,5,6,4};
        sort.quickSort(input,0,input.length-1);
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
}
