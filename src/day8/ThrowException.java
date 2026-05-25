package day8;

public class ThrowException {
    public static void main(String[] args) {
        int n=200;
        try
        {
            if(n>35)
            {
                throw new ArithmeticException(" > 35");
            }
            System.out.println("<35");
        } catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
