import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int ans =0;

        while (true) {
            System.out.println("Enter a operation");
            char op = s.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter 2 numbers");
                int num1 = s.nextInt();
                int num2 = s.nextInt();


                if (op == '+') {
                    ans = num1 + num2;

                }
                if (op == '-') {
                    ans = num1 - num2;

                }
                if (op == '*') {
                    ans = num1 * num2;

                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    

                }
                if (op == '%') {
                    ans = num1 % num2;

                }
            } else if (op == 't' || op == 'T') {
                break;


            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

        

        


         
        
    }
}
