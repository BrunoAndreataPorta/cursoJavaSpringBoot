class A
{
    int age;

    public void show()
    {
        System.out.println("In show");
    }

    static class B
    {   
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class Demo
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();
        
        // Se não é STATIC
        // A.B obj1 = obj.new A.B();

        A.B obj1 = new A.B();
        obj1.config();

    }
}