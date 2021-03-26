import java.util.Scanner;

import static java.lang.Math.abs;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10000001));
    }


    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int numberCopy = number; // copy of number
        int reverse = 0, lastDigit;
        while (numberCopy > 0) {
            lastDigit = numberCopy % 10; // remainder of last digit
            reverse = reverse * 10 + lastDigit; // makes reverse last digit
            numberCopy /= 10;
        }
        // if is same forwards and backwards returns true
        return number == reverse;
    }

}