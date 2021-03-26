public class WhileAndDoWhile {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) { // only one condition, if we cant variable we have to define it outside.
            System.out.println("Current while count value is " + count);
            count++; // need to manually increment
        }
        for (count = 1; count != 6; count++) { //increment already set
            System.out.println("Current for count value is " + count);
        }
        //counts until count is set value
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count while true value is " + count);
            count++;
        }
        // do while is exec guaranteed at least once because while check is after
        count = 1; //going to reset count to 1 because while count already counter it to 6
        do {
            System.out.println("Count do value was " + count);
            count++;
        } while (count != 6); //condition is at bottom, run then check
    }
}
