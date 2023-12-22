class MyException extends Exception
{
    public MyException(String string)
    {
        super(string);
    }
}

class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Demo");        
    }

}

public class Demo {

    static{
        System.out.println("Class Loaded");
    }

    public static void main(String a[])
    {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int i = 20;
        int j = 0;

        int nums[] = new int[5];

        try
        {
            j = 18/i;
            if (j==0)
                throw new MyException("I dont want to print zero");
            // System.out.println(nums[5]);
        }
        
        catch(MyException e)
        {
            j = 18/1;
            System.out.println("Thats the default output when you divide by zero OR j == 0 " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of limit.");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
    }    
}
