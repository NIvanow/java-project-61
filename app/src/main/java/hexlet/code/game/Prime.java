package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {
    static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int NUMBER_RANGE = 100;
    static final int NUMBER_GAMES = 3;
    private static String[][] data = new String[3][2];

    public Prime() {
    }

    public static void game() {
        Engine.start(RULES_GAME);

        for (int i = 0; i < NUMBER_GAMES; i++) {
            int randomNum = (int) (Math.random() * NUMBER_RANGE);
            data[i][0] = question(randomNum);
            data[i][1] = isPrime(randomNum);
        }

        Engine.resultGame(data);
    }

    public static String question(int number) {
        return "Question: " + number;
    }

    public static String isPrime(int number) {
        int countDevider = 1;

        for (int i = 2; i <= number; ++i) {
            if (number % i == 0) {
                ++countDevider;
            }
        }

        return countDevider == 2 ? "yes" : "no";
    }
}
