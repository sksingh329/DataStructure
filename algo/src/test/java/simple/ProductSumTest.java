package simple;

import simple.ProductSum;

import java.util.ArrayList;
import java.util.List;

public class ProductSumTest {

    public static void main(String[] args) {
        List<Object> input = new ArrayList<>();
        List<Object> input1 = new ArrayList<>();
        input1.add(5);
        input1.add(6);
        input.add(3);
        input.add(4);
        input.add(input1);

        ProductSum sum = new ProductSum();
        sum.productSum(input);
    }
}
