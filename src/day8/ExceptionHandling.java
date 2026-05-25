package day8;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        } catch(Exception e) {
            System.out.println("There is Arithmetic Exception");
        }
    }
}
