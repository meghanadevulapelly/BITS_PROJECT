package day7;

public class HandlingExceptionsInSingleFlow {

    public static void main(String[] args) {

        // Arithmetic Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
        }

        // ArrayIndexOutOfBounds Exception
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Handled");
        }

        // NullPointer Exception
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Handled");
        }

        System.out.println("Program Continues...");
    }
}

