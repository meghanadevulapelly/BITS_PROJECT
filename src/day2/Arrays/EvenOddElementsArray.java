package day2.Arrays;

import java.util.Scanner;

public class EvenOddElementsArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                even++;
            else
                odd++;

        } 
        System.out.println("Even= "+even);
        System.out.println("Odd = "+odd);
        sc.close();
    }
}
