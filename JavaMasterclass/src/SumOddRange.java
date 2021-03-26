public class SumOddRange {
    // remove psvm to run in Udemy
    public static void main(String[] args) {
        sumOdd(1, 100);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if ((start <= 0) || (end <= 0) || (end < start)) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
                //System.out.println(sum); // will print all from start to end
            }
        }
        System.out.println(sum); // will print only when reaches end
        return sum;

    }
}