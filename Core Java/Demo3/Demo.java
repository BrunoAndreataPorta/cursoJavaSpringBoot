class A extends Object
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int n)
    {
        System.out.println("in Int A");
    }

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        this();
        //super(n);
        System.out.println("in Int B");
    }
}

public class Demo
{

    public static void main(String a[])
    {
        B obj = new B(5);
    }
}