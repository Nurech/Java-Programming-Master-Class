package Section4;

public class SecondsAndMinutesChallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid minutes or seconds parameters";
        }
        long hours = minutes / 60;
        long remiainingMinutes = minutes % 60;
        return hours + "h " + remiainingMinutes + "m " + String.format("%02d", seconds) + " s"; // string format makes so that 0 is 00 for consistancy
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid seconds";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }
}
