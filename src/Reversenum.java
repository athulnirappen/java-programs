import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  number");
        int num = s.nextInt();
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;

        }
     
        System.out.println(ans);
    }
}
