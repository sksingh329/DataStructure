package sorting;

public class HeapSort {

    int[] arr;
    int heapSize;

    public HeapSort(int[] arr){
        this.arr = arr;
    }

    public void buildMaxHeap(){
        this.heapSize = arr.length-1;
        for (int i=((arr.length-1)/2);i>0;i--){
            System.out.println(i);
            maxHeapify(i);
        }
    }
    public void maxHeapify(int i){
        int l = 2*i;
        int r = 2*i+1;
        int largest;

        if(l<=heapSize && arr[l]>arr[i]) largest = l;
        else largest = i;

        if(r<=heapSize && arr[r]>arr[largest]) largest = r;
        if(largest!=i){
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            maxHeapify(largest);
        }
    }
    public void heapSort(){
        buildMaxHeap();
        for(int i = arr.length-1;i>0;i--){
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapSize -= 1;
            maxHeapify(0);
        }
    }

    public void display(){
        for (int i:arr)
            System.out.print(i+",");
    }
}
