package Section8.ArrayChallange;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers); // sorted is Integers sorted
        printArray(sorted); //print sorted integers to console
    }

    // enter numbers
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // echo back entered numbers
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    // copy entered array into new sortedArray to be use
    public static int[] sortIntegers(int[] array) {

        // alternative, use built int method of which basically does all of the below.
        // int [] sortedArray = Arrays.copyOf(array,array.length);

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true; // we set flag true to run once
        int temp;
        while (flag) {
            flag = false; // as soon as we run we turn it to false so it would loop until true again

            // element 0 50
            // element 1 160
            // element 2 40
            // we start from element 0, if element 0 is smaller than element 1 (that is true)
            // then 50 and 160 swap places.

            for (int i = 0; i < sortedArray.length - 1; i++) { // start from 0 and end when total is one less than the total length of array
                if (sortedArray[i] < sortedArray[i + 1]) { // if our number is less than the next number then we need to swap them
                    temp = sortedArray[i]; // we store our smaller number in temp
                    sortedArray[i] = sortedArray[i + 1]; // old small number is now next in array
                    sortedArray[i + 1] = temp; //bigger number is now first
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}




