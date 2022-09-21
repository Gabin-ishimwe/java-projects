import java.util.Scanner;

/*
 * Find Cost of Tile to Cover W x H Floor - Calculate the total cost of tile it would take to cover a floor plan of width and height, 
 * using a cost entered by the user.
 */

public class Rectangle {
  public static void main(String[] args) {
    System.out.println("Rectangle Area");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the height(meters): ");
    double height = scanner.nextDouble();
    System.out.print("Enter the width(meters): ");
    double width = scanner.nextDouble();
    double area = height * width;
    System.out.println("The area of the rectangle is " + Math.round(area));
  }
}
