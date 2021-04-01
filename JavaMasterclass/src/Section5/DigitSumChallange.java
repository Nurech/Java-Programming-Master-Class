package Section5;

public class DigitSumChallange {

    //this below was the original method, I got quite lost at how am I supposed to come up with the formula of extracting
    //the leas significant digit. My initial thought was, why not just extract single number from whole number
    //and add them together one by one. So below is the ORIGINAL method, and then MY METHOD.
    public static void main(String[] args) {
        System.out.println("Sum of extracted digits in 125 = " + sumDigits(125));
        System.out.println("Sum of extracted digits in -125 = " + sumDigits(-125));//challenge was to not accept negative numbers
        System.out.println("Sum of extracted digits in 4 = " + sumDigits(4)); //challenge was to exclude single number
        System.out.println("Sum of extracted digits in 125321 = " + sumDigits(125321));

        System.out.println("My initial thought method way of 125 = " + sumDigitsMyMethod(125));
        System.out.println("My initial thought method way of -125 = " + sumDigitsMyMethod(-125));//challenge was to not accept negative numbers
        System.out.println("My initial thought method way of 4 = " + sumDigitsMyMethod(4)); //challenge was to exclude single number
        System.out.println("My initial thought method way of 125321 = " + sumDigitsMyMethod(125321));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        // % eg 125 = 125 / 10 = 12.5 12.5 * 10 = 120. So 125-120 = 5
        while (number > 0) {
            // exctract least significicate digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /= 10; //same as number = number / 10
        }
        return sum;
    }

    //this was my initial thought. TL;DR it converts number intro a string and adds them as characters together from Array. don't use it.
    //cool thing now tho is that you can sort the Array or sort the String, to read it backwards for example.
    private static String sumDigitsMyMethod(int number) {
        if (number < 10) {
            return "-1";
        }
        String numberToString = String.valueOf(number);
        char[] digits = numberToString.toCharArray(); //put number characters into an array
        // int stringBackToInt = Integer.parseInt(numberToString); // use this to make string back to int
        return String.valueOf(digits); // now figure out how to add 1+2+5=8 without the previous
    }
}
