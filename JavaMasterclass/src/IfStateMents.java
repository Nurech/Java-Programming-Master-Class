public class IfStateMents {
    public static void main(String[] args) {
        int temperature = 32;
        if (temperature > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water.");
        } else if (temperature > 32 && temperature <= 30)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day.");
    }
}
