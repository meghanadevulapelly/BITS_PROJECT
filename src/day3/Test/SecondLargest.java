package day3.Test;

public class SecondLargest {

    public static int solution(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                sLargest=largest;
                largest=arr[i];
            } else if(arr[i] < largest && arr[i]>sLargest)
            {
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(solution(arr));
    }
    
}
