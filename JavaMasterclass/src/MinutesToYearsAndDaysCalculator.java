public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        System.out.println(MinutesToYearsAndDaysCalculator.printYearsAndDays(12000000));
    }

    public static long printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int totalYears = (int) (minutes / (365 * 24 * 60));
            int totalDays = (int) (minutes % (365 * 24 * 60)) / (24 * 60); // remainder from years divided by days = remainder of days
            System.out.println(minutes + " min = " + totalYears + " y and " + totalDays + " d");
        }

        return -1;
    }

}
