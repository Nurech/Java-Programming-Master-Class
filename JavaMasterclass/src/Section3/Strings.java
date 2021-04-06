package Section3;

public class Strings {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String (not a primitive type is CLASS, String is a sequence of characters, it cant be numbers
        String myString = "This is a \"exit\" string";
        System.out.println("MyString is = " + myString);
        myString = myString + " and this is more...";
        System.out.println("MyString is = " + myString);

        // String cant be numbers, only txt

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString = " + lastString);

        //Section3.Strings are immutable, cant change after is created if a new string comes

        // StringBuffer can be changed

    }
}
