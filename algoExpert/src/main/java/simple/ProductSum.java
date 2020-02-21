package simple;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public void productSum(List<Object> arrays){
        for(Object array :arrays){
            if(array instanceof ArrayList){
                System.out.println("Input is array list");
            }else{
                System.out.println("Input is integer");
            }
        }
    }
}
