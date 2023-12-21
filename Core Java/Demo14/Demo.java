interface A
{
    int age=44; //final and static
    String area="Circle";

    void show();
    void config();
}

interface X
{
    void run();

}

interface Y extends X
{

}

class B implements A, Y
{

    public void show() 
    {
        System.out.println("In show");
    }

    public void config() 
    {
        System.out.println("In config");
    }

    //Por Y dar extends em X é obrigado fazer o metodo run
    public void run()
    {
        System.out.println("Running...");
    }
}

public class Demo 
{
    public static void main(String a[]) 
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        //Impossivel pois é do tipo final
        // A.area = "Square"

        System.out.println(A.area);

    }    
}
