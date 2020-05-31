package sortingTest;

import sorting.HeapSort;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] input = {200,50, 20,80, 10, 100, 5,1,5,150};
        HeapSort heapSort = new HeapSort(input);
        System.out.println("Before sorting");
        heapSort.display();
        heapSort.heapSort();
        System.out.println("After sorting");
        heapSort.display();
    }
}
