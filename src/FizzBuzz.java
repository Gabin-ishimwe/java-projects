import java.util.Scanner;

/*
*Fizz Buzz - Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
* instead of the number and for the multiples of five print “Buzz”.
* For numbers which are multiples of both three and five print “FizzBuzz”.
*
*/
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz App");
        for (int i = 0; i <=100; i ++) {
            if (i % 3 == 0) {
              if(i % 5 == 0) {
                  System.out.println("FizzBuzz " + i);
              } else {
                  System.out.println("Fizz " + i);
              }
            } else if (i % 5 ==0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i);
            }
        }

    }
}