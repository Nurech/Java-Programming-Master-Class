package Section3;

public class FloatAndDouble {
    public static void main(String[] args) {

        /* single precision has 32 bits but double has 64 bits
           Float minimum value: 1.4E-45
           Float max value: 3.4028235E38
           Double minimum value: 4.9E-324
           Double max value: 1.7976931348623157E308
         */

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float max value: " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMindoubleValue);
        System.out.println("Double max value: " + myMaxdoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        /* convert pound into KG */
        double myPound = 0.45359237d;
        double numberOfPounds = 200d;
        double my200pound = myPound * 200d;
        double my150pounds = 150d / myPound;
        System.out.println("200 pounds in kg= " + my200pound);
        System.out.println("150 pounds in kg= " + my150pounds);


    }
}
