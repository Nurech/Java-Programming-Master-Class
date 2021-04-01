package Section4;

public class CharBoolean {
    public static void main(String[] args) {
        char myChar = 'D';
        //letter D
        char myCharUnicode = '\u0044';
        // unicode is 16 bytes so one character is 16 bytes
        System.out.println(myChar);
        System.out.println(myCharUnicode);

        // booleans
        boolean isTrueBooleanValue = true;
        boolean isFalseBooleanValue = false;

        int age = 21;
        boolean isCustomerOver21 = age >= 21;
        boolean isCustomerOver23 = age >= 22;
        System.out.println(isCustomerOver21);
        System.out.println(isCustomerOver23);


    }
}
