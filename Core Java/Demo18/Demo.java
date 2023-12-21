
class A
{
    public void showTheDataWhichBelongs()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    @Override
    public void showTheDataWhichBelongs()
    {
        System.out.println("in B show");
    }
}

public class Demo {
    public static void main(String a[]) {
        B obj = new B();
        obj.showTheDataWhichBelongs();
    }    
}
