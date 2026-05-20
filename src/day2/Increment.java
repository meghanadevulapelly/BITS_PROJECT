package day2;

public class Increment {
    public static void main(String[] args) {
        int a=5;
        int b=2,c;
        c=a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
