class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class Demo {
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new Show");
            }
        };
        obj.show();
    }
}

//Abstract and Anonymous inner class

// abstract class A
// {
//     public abstract void show();

// }

// public class Demo {
//     public static void main(String a[])
//     {
//         A obj = new A()
//         {
//             public void show()
//             {
//                 System.out.println("in new Show");
//             }
//         };
//         obj.show();
//     }
// }