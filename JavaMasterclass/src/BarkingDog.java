public class BarkingDog {

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
