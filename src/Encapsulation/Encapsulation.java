package Encapsulation;

/**
 * Created by Zahakaylo on 10.12.2016.
 */
class A{
    public String a = " public ";
    protected String aa = "protected";
}

class B{
    private String Method(){
                return "private";
    }
}

class C{
    protected String c = "protected";
    private static String cc = "private";
}

public class Encapsulation
{
    private static String pr = "private";
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a.a);
        System.out.println(a.aa);
        //System.out.println(b.Method); // Error
        System.out.println(c.c);
        // System.out.println(c.cc);// Error
        System.out.println(pr);
    }
}
