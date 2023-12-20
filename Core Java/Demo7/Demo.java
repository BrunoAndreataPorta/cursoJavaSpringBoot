// começar com a palavra "final" não deixa que 

class Calc
{
    public void show()
    {
        System.out.println("In Calc Show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{

}


public class Demo
{
    public static void main(String a[])
    {
        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);

    }

}