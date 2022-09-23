import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter another whole number to divide: ");
            int y = scanner.nextInt();
            int result= x/y;
            System.out.println("result is " + result);
        } catch (java.lang.Exception e) {
            System.out.println("something went wrong");
        }
    }
}
