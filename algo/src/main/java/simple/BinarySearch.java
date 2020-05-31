package simple;

public class BinarySearch {

    public int binarySearch(int[] array, int target){
        int mid= -1, left =0, right = array.length-1;
        boolean found = false;
        while(left <= right && !found){

            mid = (left+right)/2;
            System.out.println("left="+left+",right="+right+",mid="+mid);
            //System.out.println(array[mid]);
            if(array[mid]==target) found = true;
            else if(array[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        if(found == true) return mid;
        else return -1;
    }
}
