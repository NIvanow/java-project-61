package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[][] data = new String[Engine.NUMBER_GAMES][2];

    public static void game() {
        for (int i = 0; i < Engine.NUMBER_GAMES; i++) {
            int randomNum = Utils.randomNum();

            data[i][0] = "Question: " + randomNum;
            data[i][1] = isPrime(randomNum) ?  "yes" : "no";
        }
        Engine.start(RULES_GAME, data);
    }

    public static boolean isPrime(int number) {
        int countDevider = 1;

        for (int i = 2; i <= number; ++i) {
            if (number % i == 0) {
                ++countDevider;
            }
        }
        return countDevider == 2;
    }
}
