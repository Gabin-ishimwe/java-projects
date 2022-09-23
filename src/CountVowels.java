/*
* Count Vowels - Enter a string and the program counts the number of vowels in the text.
* For added complexity have it report a sum of each vowel found.
* */

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println("Counter Vowels App");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word of choice? ");
        String word = scanner.nextLine();
        int vowelNum = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0;  i < word.length(); i ++) {
            for (char vowel:vowels) {
                if (word.charAt(i) == vowel) {
                    vowelNum += 1;
                }
            }
        }

        System.out.println("Number of vowels found is " + vowelNum);


    }
}
