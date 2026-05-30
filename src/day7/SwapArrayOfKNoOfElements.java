package day7;

import java.util.Scanner;

public class SwapArrayOfKNoOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int k = 2; // rotate first 2 elements to end

        for (int i = k; i < n; i++)
            System.out.print(a[i] + " ");

        for (int i = 0; i < k; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
    
}
