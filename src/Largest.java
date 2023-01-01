import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int max = num1;
        if (num2 > max) {
            max=num2;

        }
        if (num3 > max) {
            max = num3;

        }
        
        System.out.println("greatest num is  "  +max);
    }
}
