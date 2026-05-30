package day7;

public class EligibleWork {
    public static void main(String[] args) {
        int n=30;
        try
        {
            if(n>18)
            {
                throw new ArithmeticException("is eligible for work");
            }
            System.out.println("is not Eligible for work");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
  
