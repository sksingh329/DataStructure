package sorting;

public class QuickSort {
    public void quickSort(int[] arr, int p, int r){
        int q;
        if(p<r){
            q = partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }
    }

    public int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i= p -1;
        for (int j =p; j < r; j++){
            if(arr[j]<= x){
                i = i + 1;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        int tmp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = tmp;
        return i+1;
    }
}
