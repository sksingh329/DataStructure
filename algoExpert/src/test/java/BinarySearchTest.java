import simple.BinarySearch;

public class BinarySearchTest {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] input = {1,5,23,111};
        int output = bs.binarySearch(input,111);

        System.out.println(output);
    }
}
