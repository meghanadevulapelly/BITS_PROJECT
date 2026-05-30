package day10;

public class BinarySearchPosition {
    public int searchInsert(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low++;            }
            else
            {
                high--;
            }
        }
        return low;
    }
}
