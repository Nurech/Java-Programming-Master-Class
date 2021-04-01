package Section3;

public class operatorTest {
    public static void main(String[] args) {
        double number = 20.00d;
        double number2 = 80.00d;
        double myValuesTotal = (number + number2) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder is: " + theRemainder);
        boolean isNoRemainder = theRemainder == 0;
        System.out.println("isNoRemainder: " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
