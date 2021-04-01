package Section5;

import java.util.Scanner;

public class ScannerAndParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // were creating new object of Scanner
        System.out.print("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt(); //scanner converts input directly into Int
            scanner.nextLine(); // handle Enter problem.
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is: " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Please enter numbers only!");
        }

        scanner.close();
    }



}
