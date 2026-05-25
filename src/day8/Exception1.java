package day8;

public class Exception1 {
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        try
        {
            for(int i=0;i<7;i++)
            {
                arr[i]=2;
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array is full");
        }
    }
}
