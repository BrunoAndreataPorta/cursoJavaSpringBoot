// import java.util.ArrayList;
// import java.util.Collection;
import java.util.HashSet;
// import java.util.List;
import java.util.Set;

public class Demo
{
    public static void main(String a[]){
        //List é util para trabalhar com o index do valor
        //Collection é para valores unicos
        //Set é para valores unico além dele não ter um valor index
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("9");
        
        //System.out.println(nums.indexOf(5));

        for(int n : nums)
        {
            System.out.println(n);
        }

        System.out.println(nums);

    }
}