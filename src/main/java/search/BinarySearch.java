package search;

public class BinarySearch<T> {

    //should return the index of the element found
    //return -1 if not found
    int search(Integer value, Integer[] array){
    return binarySearch(array,value,0,array.length-1);
    }

    public int binarySearch(Integer[] array, Integer value, int left, int right){
        int mid = left + (right - left) / 2;
        if(right >= left){
            if(array[mid] == value){
                return mid;
            } else if(array[mid] > value){
                return binarySearch(array,value, left,mid -1);
            } else if(array[mid] < value){
                return binarySearch(array,value,mid+1,right);
            }
        }
        return -1;
    }

}
