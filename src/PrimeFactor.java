import java.util.Scanner;

/*
 * Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) 
 * and display them.
 */

public class PrimeFactor {
    public static void main(String[] args) throws Exception {
        System.out.println("Prime Factorial");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number(must be integer): ");
        int num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
