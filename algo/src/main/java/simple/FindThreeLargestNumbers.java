package simple;

public class FindThreeLargestNumbers {

    public void findThreeLargestNumbers(int[] array){
        int[] output = new int[3];
        for(int i=0;i<array.length;i++){
            if(output[2]<array[i]){
                output[0] = output[1];
                output[1] = output[2];
                output[2] = array[i];
            }
            else if(output[1]<array[i]){
                output[0] = output[1];
                output[1] = array[i];
            }
            else if(output[0]<array[i]){
                output[0] = array[i];
            }
        }

        for(int i =0; i<output.length;i++)
            System.out.println(output[i]);

    }
}
