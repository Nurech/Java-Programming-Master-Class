package Section8.ReservseArray;

// copy below for Udemy Coding Exercise 43: Reverse Array. remove main()
import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
    }

    // use temp var to temporarily store element value
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
