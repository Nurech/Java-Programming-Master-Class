public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(253));
    }

    // to to find last number we % we get last number is 3
    // we use pow dived number itself to find first number
    public static int sumFirstAndLastDigit(int number) {
        int numberCopy = number; // we need to make copy of original number
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = 0, firstDigit = 0, count = 0;
            lastDigit = number % 10; // we take the last digit first, remainder of number
            while (numberCopy > 0) { // minus causes errors, so check if bigger than zero
                numberCopy /= 10;
                count++; // we count how many times to loop, so we can pow the first number
            }
            System.out.println((int) (number / (Math.pow(10, 2)))); //253 / 10^2 how many times number can be divided by itself in pow -
            // only 2 times, so first number is 2
            firstDigit = (int) (number / (Math.pow(10, count - 1)));
            return firstDigit + lastDigit;
        }
    }
}

// sum of all digits 2+5+3=10
//                int sum = 0;
//                while (number > 0) {
//                int digit = number % 10;
//                sum += digit;
//                number = number / 10;
//                }
//                return sum;