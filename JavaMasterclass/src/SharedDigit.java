public class SharedDigit {
    //remove main() before submitting to Udemy
    public static void main(String[] args) {
        hasSharedDigit(12, 33);
    }

    public static boolean hasSharedDigit(int a, int b) {
        // is it within range?
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            if ((a / 10) == (b / 10) || (a / 10) == (b % 10) || (a % 10) == (b / 10) || (a % 10) == (b % 10)) {
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;
        }
        System.out.println("false");
        return false;
    }
}
