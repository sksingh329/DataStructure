public class MergeSort {

    public void merge(int[] array, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        //System.out.println("n1="+n1+",n2="+n2);
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];
        for(int i = 0; i<n1;i++) {
            left[i] = array[p + i];
            //System.out.println("left["+i+"]="+left[i]);
        }
        for(int j = 0; j<n2;j++) {
            right[j] = array[q+j+1];
            //System.out.println("right["+j+"]="+right[j]);
        }
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;
        int i = 0,j =0;
        for(int k =p; k<=r;k++){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i = i+1;
            }
            else{
                array[k] = right[j];
                j++;
            }
        }
    }

    public void mergeSort(int[] array, int p, int r){
        int q;
        if(p < r){
            q = (p+r)/2;
            mergeSort(array,p,q);
            mergeSort(array,q+1,r);
            merge(array,p,q,r);
        }
    }
}
