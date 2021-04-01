public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder word = new StringBuilder();
        int digit;
        int reverseNumber = reverse(number);
        int numberOfZeroes = getDigitCount(number) - getDigitCount(reverseNumber);

        do {
            digit = reverseNumber % 10;
            switch (digit) {
                case 1 -> word.append("One");
                case 2 -> word.append("Two");
                case 3 -> word.append("Three");
                case 4 -> word.append("Four");
                case 5 -> word.append("Five");
                case 6 -> word.append("Six");
                case 7 -> word.append("Seven");
                case 8 -> word.append("Eight");
                case 9 -> word.append("Nine");
                default -> word.append("Zero");
            }
            word.append("\n");
            reverseNumber /= 10;
        } while (reverseNumber > 0);

        for (int i=0; i<numberOfZeroes; i++) {
            word.append("Zero\n");
        }
        System.out.println(word);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while(number > 0);
        return count;
    }
}