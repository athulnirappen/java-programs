import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if (num1 > num2) {
            System.out.println("First number is greater");
        
        } else {
            System.out.println("Second number is greater");
        }

    }

}
