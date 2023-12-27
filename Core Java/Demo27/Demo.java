import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
}

public class Demo {
    
    public static void main(String a[]) {
        
        Comparator<Student> com = (Student i, Student j) -> i.age > j.age?1:-1;
            //É possivel fazer isso tudo só com a linha acima.
            //{
                // if(i.age > j.age)
                //     return 1;
                // else
                //     return -1;
            //};

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(18, "Bruno"));
        studs.add(new Student(20, "Gabriel"));
        studs.add(new Student(16, "Jorge"));
        studs.add(new Student(24, "Matheus"));

        Collections.sort(studs, com);

        for(Student s : studs)
            System.out.println(s);
    }
}
