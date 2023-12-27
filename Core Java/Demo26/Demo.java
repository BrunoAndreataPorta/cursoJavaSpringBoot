import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String a[]) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Bruno", 56);
        students.put("Jorge", 23);
        students.put("Matheus", 67);
        students.put("Gabriel", 92);
        students.put("Bruno", 63);

        // System.out.println(students.get("Bruno"));
        System.out.println(students.keySet());

        for(String name : students.keySet())
        {
            System.out.println(name + " : " + students.get(name));
        }

    }

}
