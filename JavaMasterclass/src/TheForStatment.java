public class TheForStatment {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) { //increment start is i, terminator when to terminate, how to increment
            System.out.println("10,000 at " + i + "% interest " + String.format("%.2f", calculateInterest(10000, i)));
        }
        for (int i = 8; i >= 2; i--) { //negative increment
            System.out.println("10,000 at " + i + "% interest " + String.format("%.2f", calculateInterest(10000, i)));
        }
        int count = 0; //need to create counter to count how many times isPrime loops
        for (int i = 10; i < 50; i++) { // start from 10 count to 50
            if (isPrime(i)) {
                count++; // increase counter count for each found prime number
                System.out.println("number " + i + " is a prime.");
                if (count == 10) { // count 10 numbers and exit, if less go run count isPrime again
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

