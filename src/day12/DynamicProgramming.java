package day12;

import java.util.*;

public class DynamicProgramming {
    public static void main(String[] args) {
        int n = 5;
        int sum=6;
        int[] dp = new int[n + 1];
        dp[0] = 0; // Base case: There is one way to make change for 0 amount
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1]+i; // Initialize dp[i] to 0
            
        }
        System.out.println(Arrays.toString(dp));
        for (int i = 1; i <= n; i++) {
            if(dp[i]==sum)
            {
                System.out.println(i+1);
                break;
            }
            }
        }
    }

