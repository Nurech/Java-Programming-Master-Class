public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        } else {
            int numberCopy = number; //make copy of number to modify it
            int remainder = 0;
            int sum = 0; //add even number sum is set 0
            while (numberCopy > 0) { // if number copy is not negative then loop
                remainder = numberCopy % 10; // if modulus from % 10 and %2 == 0 the it is even.
                if (remainder % 2 == 0) {
                    sum = sum + remainder; //only add +remainder to previous sum if it was even.
                }
                numberCopy = numberCopy / 10; // it goes to loop, and count forward as long as there is next
                // number to count. if not break look, return current sum.
            }
            return sum; // 2+4+6+8=20
        }


    }


}
