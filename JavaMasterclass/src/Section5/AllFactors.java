package Section5;

public class AllFactors {

    public static void main(String[] args) {
        AllFactors.printFactors(6);
        AllFactors.printFactors(32);
        AllFactors.printFactors(10);
        AllFactors.printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value"); // if less than 1 is Invalid
            return;
        }

        // constructs string builder with no characters
        var factors = new StringBuilder();
        for (int i = 1; number / 2 + 1 > i; i++) {
            int remainder = number % i;
            factors.append(remainder == 0 ? i + "\n" : "");
        }
        factors.append(number);
        System.out.println(factors);
    }
}