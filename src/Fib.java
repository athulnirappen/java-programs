import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = s.nextInt();
        int a = 0;
        int b = 1;
        int count=2;
        
        while (count <= limit) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }

        System.out.println(b);
    }
}
