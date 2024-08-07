package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[][] data = new String[Engine.NUMBER_GAMES][2];

    public static void game() {
        for (int i = 0; i < Engine.NUMBER_GAMES; ++i) {
            int randomNum = Utils.randomNum(20);
            data[i][0] = "Question: " + randomNum;
            data[i][1] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.start(RULES_GAME, data);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
