package day3;

import java.util.Arrays;

public class LeftRotationByKValues {

    public static void reverse(int[] arr,int start,int end)
{
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}

    public static void solution(int[] arr,int k)
    {
        int size=arr.length;
        k=k%arr.length;

        reverse(arr, 0, k-1);
        reverse(arr, k, size-1);
        reverse(arr, 0, size-1);
        
       
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=7;
        solution(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
