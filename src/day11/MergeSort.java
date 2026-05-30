package day11;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void conquer(int arr[],int s1, int mid,int ei)
    {
        int merged[]=new int[ei-s1+1];
        int idx1=s1;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x++]=arr[idx1++];
            }
            else
            {
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei)
        {
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=s1;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }

        
    }
    public static void divide(int arr[],int s1,int ei)
        {
            if(s1>=ei)
            {
                return;
            }
            int mid=(s1+ei)/2;
            divide(arr,s1,mid);
            divide(arr,mid+1,ei);
            conquer(arr,s1,mid,ei);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            divide(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
            sc.close();
        }
}
