/*
* Check if Palindrome - Checks if the string entered by the user is a palindrome. That is that it reads
* the same forwards as backwards like “racecar”
* */


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome App");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you word of choice? ");
        String choiceWord = scanner.nextLine();

        System.out.println(palindrome(choiceWord));



    }

    public static boolean palindrome(String word) {
        String palindrome = "";
        for (int i = word.length()-1; i >=0; i --) {
            palindrome += word.charAt(i);
        }
        return palindrome.equals(word);
    }
}
