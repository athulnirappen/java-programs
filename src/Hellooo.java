import java.util.Scanner;

public class Hellooo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 2 number");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;
        System.out.println("Result:"+c);
    }
}
