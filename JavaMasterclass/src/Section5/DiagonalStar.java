package Section5;// https://stackoverflow.com/questions/64036847/diagonal-star-challenge-not-understanding-its-concept
// relatable...

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == j || i == (number - 1) ||
                            j == number - 1 || i + j == (number - 1)) {
                        System.out.print("*"); //prints on same line
                    }
                    //none of these operations work then just leave a space
                    //on that column
                    else {
                        System.out.print(" ");
                    }
                }
                //creates a new row
                System.out.println();
            }
        }
    }
}
