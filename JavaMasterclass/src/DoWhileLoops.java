import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            //runs atleast once, checks while statment last
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        while (!input.equals("quit"));
    }
}
