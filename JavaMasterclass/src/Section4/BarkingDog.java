package Section4;

public class BarkingDog {

    // create main to test but basically it will test if dog is barking at night and should you wake up for it?
    // if its just barking at day then don't react.
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("false");
            return false;
        }

        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
