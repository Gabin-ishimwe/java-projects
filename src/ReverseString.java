/*
* Reverse a String - Enter a string and the program will reverse it and print it out.
* */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reverse String App");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println("reverse string is " + reverse);

    }
}
