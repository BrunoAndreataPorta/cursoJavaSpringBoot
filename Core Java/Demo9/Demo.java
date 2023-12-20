class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}
public class Demo
{
    public static void main(String a[])
    {
        //Upcasting
        A obj = (A) new B();
        obj.show1();

        //Downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }


}
