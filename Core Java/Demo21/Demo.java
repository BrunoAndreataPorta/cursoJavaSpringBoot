import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String a[]) throws IOException
    {
        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        
        Scanner sc = new Scanner(System.in);

        // int num = Integer.parseInt(bf.readLine());

        int num = sc.nextInt();
        System.out.println(num);

        // bf.close();
    }
}
