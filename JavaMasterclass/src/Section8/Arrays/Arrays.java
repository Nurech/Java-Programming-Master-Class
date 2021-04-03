package Section8.Arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    // set how many times to ask number. return entered numbers. return average.
    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
        for (int i = 0; i <myIntegers.length;i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average of entered array was: " + getAverage(myIntegers));
    }

    // ask to enter int number 5 times
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // calculate average of entered array
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length;i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

}
