import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage(); // calling method to test it
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: "); // were going to ask our first number
        int sum = 0, count = 0;
        int number = 0;
        while(true) {

            if(scanner.hasNextInt()) {
                number = scanner.nextInt(); // if inserted number is number then loop
                sum = sum + number; // we add numbers together in sum
                count++;
            } else { // if entered number is not Int number then break
                break;
            }
            scanner.nextLine();
            System.out.print("Input number: ");
        }
        int avg = (int) Math.round((double) sum / count); // after breaking we calculate average by sum divided by entered numbers amount

        System.out.println("SUM = " + sum + " AVG = " + avg + ""); //if we break in first loop it will print 0 0
    }
}
