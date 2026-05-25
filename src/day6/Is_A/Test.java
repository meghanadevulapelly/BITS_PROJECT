package day6.Is_A;

class P{
    public void m1()
    {
        System.out.println("m1 method");
    }
}

class C extends P {
    public void m2()
    {
        System.out.println("m2 method");
    }
}

public class Test {
    public static void main(String[] args) {
        C c=new C();
        c.m1();
        c.m2(); 

        P p=new P();
        p.m1();
        

        P p1=new C();
        p1.m1();

    }
}
