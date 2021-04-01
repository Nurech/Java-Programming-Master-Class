import java.util.Scanner;

public class MinMaxChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstNumber = true; // we add boolean flag check for first number

        while (true) {
            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (firstNumber) {
                    firstNumber = false; // first number will be checked, else min would be 0 always
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
        scanner.nextLine();
        System.out.println("Min = " + min + " Max = " + max);
        scanner.close();
    }

}

