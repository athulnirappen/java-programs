import java.util.Scanner;

public class Findnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        int count = 0;

        while (num > 0) {
            int rem=num % 10;
            if (rem == 3) {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
