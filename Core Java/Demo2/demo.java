
class Human
{
    private int age;
    private String name;

    //Default Constructor
    public Human()
    {
        age = 12;
        name= "John";
    }

    //Parameterized Constructor
    public Human(int a, String n)
    {
        age = a;
        name = n;
    }

    //Metodos usados para pegar as variaveis definidas "private" e para mostrar
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String age)
    {
        this.name = age;
    }
}

public class demo
{
    public static void main(String a[])
    {
        Human obj = new Human();
        Human obj1 = new Human(18, "Bruno");

        // obj.setAge(19);
        // obj.setName("Bruno");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}