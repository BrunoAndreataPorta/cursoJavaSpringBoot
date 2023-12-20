
class A
{
    public void show()
    {
        System.out.println("A Show");
    }
}
class B extends A
{
    public void show()
    {
    System.out.println("B Show");
    }
}


public class Demo
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();
        // O tipo de objeto é criado com base na classe A
        /* A */obj = new B();
        obj.show();


    }
}