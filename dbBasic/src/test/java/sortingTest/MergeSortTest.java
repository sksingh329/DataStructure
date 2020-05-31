package sortingTest;

import sorting.MergeSort;

public class MergeSortTest {
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] input = {200,50, 20,80, 10, 100, 5,1,5,150};
        sort.mergeSort(input,0,input.length);
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
}
