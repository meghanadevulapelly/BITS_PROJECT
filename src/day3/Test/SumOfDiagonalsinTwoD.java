package day3.Test;

public class SumOfDiagonalsinTwoD {


    public static int solution(int[][] arr)
    {
        int size=arr.length;

        int sum=0;

        for(int i=0;i<size;i++)
        {
            //primary diagonal i==j
            sum=sum+arr[i][i];

            //secondary diagonal i+j==size -1=> j=size-1-i
            sum=sum+arr[i][size-1-i];

        }
        if(size % 2== 1)
        {
            sum= sum-arr[size/2][size/2];
        }
        return sum;

    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(solution(arr));
    }
}
