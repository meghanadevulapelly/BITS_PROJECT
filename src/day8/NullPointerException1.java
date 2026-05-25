package day8;

public class NullPointerException1 {

    public static void main(String[] args) {

        try {

            String s = null;
            String s1 = "minnu";

            if (s1.equals(s)) {
                System.out.println("Equals");
            }

            System.out.println(9 / 0);

        }

        catch (NullPointerException e) {
            System.out.println("Null");
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}