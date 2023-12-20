
class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class demo{
    public static void main(String a[]) throws ClassNotFoundException
    {
        //Loading Block for Static Variables
        Class.forName("Mobile");

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();


    }    
}
