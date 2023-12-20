abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car
{

    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdateWagonR extends WagonR
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class Demo
{
    public static void main(String a[]) 
    {
        Car obj = new UpdateWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}