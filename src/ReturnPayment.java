import java.util.Scanner;

/*
 * 
 * Change Return Program - The user enters a cost and then the amount of money given. 
 * The program will figure out the change and the number of quarters, dimes, nickels, 
 * pennies needed for the change.
 */

public class ReturnPayment {
  public static void main(String[] args) {
    System.out.println("Return on payment made");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Cost of the product: ");
    double costProduct = scanner.nextDouble();
    System.out.print("Enter you amount: ");
    double amountPayed = scanner.nextDouble();
    double returnPay = amountPayed - costProduct;
    if (returnPay < 0) {
      System.out.println("Oops, you amount is not sufficient!!!");
    } else {
      System.out.println("Your change is " + returnPay);
    }
  }
}
