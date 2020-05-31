package sortingTest;

import sorting.CountingSort;

public class CountingSortTest {
    public static void main(String[] args) {
        int[] input = {2,5,9,8,2,8,7,10,4,3};
        CountingSort sort = new CountingSort();
        sort.countingSort(input,1,10);
        for(int i:input)
            System.out.println(i);
    }
}
