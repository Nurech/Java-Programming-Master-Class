import java.util.Scanner;

public class BuzzNumberFizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Insert a number that is devisible by 3 (Buzz) or 5 (Fizz)?: ");
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                if (number % 3 == 0)
                    System.out.println("FizzBuzz! Gratz!");
                else
                    System.out.println("Fizz");
            } else if (number % 3 == 0)
                System.out.println("Buzz");
        }
    }
}