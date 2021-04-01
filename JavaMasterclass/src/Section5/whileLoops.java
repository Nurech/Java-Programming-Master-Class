package Section5;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
