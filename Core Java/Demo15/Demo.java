
interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, compile, run : FASTER");
    }
}


class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Demo 
{
    public static void main(String a[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer bruno = new Developer();
        bruno.devApp(lap);
        bruno.devApp(desk);
    }    
}
