package Section5;

import java.util.Scanner;

public class ReadingUserInputChallange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while(true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.print("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//               if(counter == 10) {
//                   break;
//               }
            } else {
                System.out.print("Invalid number");
            }

            scanner.nextLine(); // handle end of line problem with scanner
        }

        System.out.print("sum = " + sum);
        scanner.close();

    }
}
