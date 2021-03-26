public class IsEvenNumber {
    public static void main(String[] args) {

        int number = 4; // beginning number
        int finishNumber = 20; // when to stop counting
        int counter = 0;

        while (number <= finishNumber) { // if it is less, keep counting
            number++; // add +1 if isEvenNumber is not number but if number is even number, then it prints it.
            if (counter != 5) { // count only the first 5 even numbers then stop
                if (!isEvenNumber(number)) {
                    continue;

                }
                System.out.println(number);
                counter++;
            }
        }

    }

    public static boolean isEvenNumber(int number) {
        // if it is divisible by 2 with no remainder its even != 0 would be odd
        return number % 2 == 0;
    }
}
