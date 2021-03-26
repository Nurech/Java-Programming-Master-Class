public class MethodOverloacding {
    public static void main(String[] args) {
        int newScore = calculateScore("Joosep", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player Name No Score");
        return 0;
    }

}
