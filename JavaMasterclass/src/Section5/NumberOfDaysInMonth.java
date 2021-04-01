package Section5;//the old Section5.Switch method with breaks
/*
public class Section5.NumberOfDaysInMonth {
    public static void isLeapyear(int year){
        if ((year < 1) || (year > 9999)){
            System.out.println("false");;
        } else if (( year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("true");
        }
    }
    public static void getDaysInMonth(int month, int year){
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))){
            System.out.println("-1");
        } else {
            switch (Section5.NumberOfDaysInMonth.isLeapyear(){
                case isLeapyear("true") -> System.out.println("true");

            }
        }
    }
}

public class Section5.NumberOfDaysInMonth {

    public static  boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            return leapYear;
        } else {
            if ((year % 4) == 0  && (year % 100 != 0)) {
                leapYear = true;
            } else if ((year % 100) == 0 && (year % 400 ) == 0 ) {
                leapYear = true;
            } else
                leapYear = false;
        }
        return leapYear;
    }*/

//this is with Advanced Section5.Switch from Java 12+, this looks better and is easier to understand.
public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            return leapYear;
        } else {
            if ((year % 4) == 0 && (year % 100 != 0)) {
                leapYear = true;
            } else leapYear = (year % 100) == 0 && (year % 400) == 0;
        }
        return leapYear;
    }


    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int noOfDays = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> noOfDays = 31;
            case 2 -> {
                if (isLeapYear(year)) {
                    noOfDays = 29;
                    break;
                }
                noOfDays = 28;
            }
            case 4, 6, 9, 11 -> noOfDays = 30;
            default -> noOfDays = -1;
        }
        return noOfDays;

    }


}