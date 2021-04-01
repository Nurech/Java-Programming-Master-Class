package Section5;

public class SwithStatements {
    public static void main(String[] args) {
        String role = "ds";

        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest.");
        }
    }
}
