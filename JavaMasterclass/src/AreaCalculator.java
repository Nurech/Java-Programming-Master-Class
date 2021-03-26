import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a radius: ");
        double radius = scanner.nextInt();
        System.out.println(AreaCalculator.area(radius));

        System.out.print("Insert a x: ");
        double x = scanner.nextInt();
        System.out.print("Insert a y: ");
        double y = scanner.nextInt();
        System.out.println(AreaCalculator.area(x, y));
    }

    public static double area(double radius) {
        if (radius < 0.0) {
            return -1.0;
        } else {
            return (Math.PI * Math.pow(radius, 2));
        }
    }

    public static double area(double x, double y) {
        if ((x < 0.0) || (y < 0.0)) {
            return -1.0;
        } else {
            return (x * y);
        }
    }
}
