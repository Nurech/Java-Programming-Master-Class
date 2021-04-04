package Section8.ReferenceAndValueTypes;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("My anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("My anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5]; //array if reference type, it holds address to the object, new means new object
        int[] anotherArray = myIntArray; // they hold the same address

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("after method modify change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after method modify change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};

        System.out.println("after method modify change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after method modify change anotherArray = " + Arrays.toString(anotherArray));


    }
    public static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
