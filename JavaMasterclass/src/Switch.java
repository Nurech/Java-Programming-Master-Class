// Udemy environment wont accept Enhanced Switch -> since Java 12+. Must use break;
public class Switch {
    public static void main(String[] args) {

        String month = "january";
        switch (month.toUpperCase()) {
            case "JANUARY" -> System.out.println("it was January");
            case "June" -> System.out.println("it was June");
            default -> System.out.println("im not sure");
        }

        char switchChar = 'C';
        switch (switchChar) {
            case 'A' -> System.out.println("it was A");
            case 'B' -> System.out.println("it was B");
            case 'C' -> System.out.println("it was C");
            case 'D' -> System.out.println("it was D");
            case 'E' -> System.out.println("it was E");
            default -> System.out.println("Could not find A, b, C, D, E. Instead found: " + switchChar);
        }

        int switchValue = 6;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4, or 5.");
                System.out.println("Actually it was switchValue " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, 5, it was = " + switchValue);
        }
        // break would come here and continue here
    }
}
