package day8;

import java.util.Scanner;

public class StringContainsNumberOrNot {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= t; i++) {

            String str = sc.nextLine();

            boolean hasNumber = false;

            for (int j = 0; j < str.length(); j++) {

                if (Character.isDigit(str.charAt(j))) {
                    hasNumber = true;
                    break;
                }
            }

            if (hasNumber)
                System.out.println("True");
            else
                System.out.println("False");
        }
        sc.close();
    }
}
