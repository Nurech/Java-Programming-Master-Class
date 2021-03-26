public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1; // indicate error by default
        // void don't send any data back
    }

    public static void main2(String[] args) {
    }
}
