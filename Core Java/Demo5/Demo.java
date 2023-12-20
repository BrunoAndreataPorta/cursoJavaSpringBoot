class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}
class A
{
    public void show()
    {
        System.out.println("in A show");
    }
    public void config()
    {
        System.out.println("in A config");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

public class Demo
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
}