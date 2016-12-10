package Inheritance;

/**
 * Created by Zahakaylo on 10.12.2016.
 */
interface Interface1
{
    int a = 2016;
    String Method();
}

interface Interface2
{
    int a = 2017;
    String Method();
}
 class IntefaceClass implements Interface1,Interface2
{
    public String Method()
    {
        return "Good";
    }
}

public class Interface
{

    public static void main (String[] arg)
    {
       IntefaceClass intefaceClass = new IntefaceClass();
        System.out.println(intefaceClass.Method()); // Good
        System.out.println(Interface1.a); // 2016
        System.out.println( ( (Interface2) intefaceClass).a ); //2017
    }
}
