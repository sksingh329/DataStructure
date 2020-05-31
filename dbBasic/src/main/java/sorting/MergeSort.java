package sorting;

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

    public void merge2(int[] input,int start,int mid,int end){
        if(input[mid-1] <= input[mid]) return;

        int i = start, j = mid, tempIndex = 0;
        int[] temp =new int[end-start];

        while(i<mid && j<end){
            temp[tempIndex++]=input[i]<=input[j]?input[i++]:input[j++];
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }

    public void mergeSort(int[] array, int p, int r){
        if(r-p<2) return;
        int q;

            q = (p+r)/2;
            mergeSort(array,p,q);
            mergeSort(array,q,r);
            merge2(array,p,q,r);

    }
}
