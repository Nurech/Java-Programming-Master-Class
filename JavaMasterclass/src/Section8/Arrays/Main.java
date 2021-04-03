package Section8.Arrays;

public class Main {
    public static void main(String[] args) {
       // this is illegal int[] myVariable = 50; // use [] for array variable
        // int [] myIntArray = new int [10]; // assigned 10 elements into myVariable
        // int [] myIntArray = {1,2,3,4,5,6,7,8,9,10}; one way to add numbers
        int [] myIntArray = new int[25];

        for (int i= 0; i<myIntArray.length; i++){ // if you add array length you only have to update base value
            myIntArray[i] = i*10;
        }

        for (int i=0; i<myIntArray.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        myIntArray [5] = 50; // java always counts from position 0; so 50 is stored on slot 6
        double [] myDoubleArray = new double [10];

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

        printArray(myIntArray);
    }

    public static void printArray (int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
