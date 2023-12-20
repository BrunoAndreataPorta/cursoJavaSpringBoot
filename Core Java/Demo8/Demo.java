class Laptop
{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    public boolean equals(Laptop that)
    {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class Demo
{
    public static void main(String a[])
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga1";
        obj1.price = 1000;

        boolean result = obj.equals(obj1);

        System.out.println(result);
    }
}