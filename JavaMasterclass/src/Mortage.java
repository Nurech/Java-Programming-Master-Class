import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.*;

class Mortage {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        try (Scanner scanner = new Scanner(in)) {
            while (true) {
                out.print("Principle ($1k - $1m): ");
                principal = scanner.nextInt();
                if (principal < 1000 || principal > 1_000_000) out.println("Please add princible ($1k - $1m): ");
                else {
                    break;
                }
            }
            while (true) {
                out.print("Annual interest rate (1-30)?: ");
                float annualInterest = scanner.nextFloat();
                if (annualInterest < 1 || annualInterest > 30) out.println("Please add annual interest rate (1-30)?: ");
                else {
                    monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                    break;
                }
            }
            while (true) {
                out.print("Period (Years 1-30)?: ");
                var years = scanner.nextByte();
                if (years < 1 || years > 30) {
                    out.println("Please add Period (Years 1-30)?: ");
                } else {
                    numberOfPayments = years * MONTHS_IN_YEAR;
                    break;
                }
            }
        }

        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortageFormatter = NumberFormat.getCurrencyInstance().format(mortage);
        out.println("Mortage: " + mortageFormatter);
    }
}

