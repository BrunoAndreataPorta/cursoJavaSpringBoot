import java.util.Arrays;
import java.util.List;
// import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bruno", "Jonas", "Navin", "Jorge");
        
        String name = names.stream()
            .filter(str -> str.contains("h"))
            .findFirst()
            .orElse("Not found");

        System.out.println(name);


    }
}
