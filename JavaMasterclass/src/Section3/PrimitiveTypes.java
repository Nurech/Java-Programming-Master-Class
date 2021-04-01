package Section3;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //you can add underscores _ to numbers to keep formatting readable
        int myValue = 10_000;
        // 32b its certain data types take up more memory
        //-2147483647
        int myMinIntValue = Integer.MIN_VALUE;
        //2147483647
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        // overflow, max value is 2147483647 but turns into -2147483648
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        // -128
        System.out.println("MyMinBYTE: " + myMinByteValue);
        // 127
        System.out.println("MyMAXBYTE: " + myMaxByteValue);

        //16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        // -32768
        System.out.println("MyMinShort: " + myMinShortValue);
        // 32767
        System.out.println("MyMAXShort: " + myMaxShortValue);

        // 62 bits without "L" at end its interpreted as integer and wont work
        long myLongValue = 10000000000L;
        System.out.println("MyLongValue: " + myLongValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        // -9223372036854775808
        System.out.println("MyMinLong: " + myMinLongValue);
        // 9223372036854775807
        System.out.println("MyMAXLong: " + myMaxLongValue);

        //casting one number into another format

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("MyNewShortValue: " + myNewShortValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));


    }
}
