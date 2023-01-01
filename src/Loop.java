import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  a number");
        int n = s.nextInt();

        // for loop
        // for (int num = 1; num <= n; num++) {
        //     System.out.println(num + " ");
        // }

        //while loop

        int num = 1;
        while (num <= n) {
            System.out.println(num + " ");
            num += 1;

        }
    }
}
