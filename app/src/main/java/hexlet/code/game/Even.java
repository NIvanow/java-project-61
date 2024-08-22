package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] data = new String[Engine.NUMBER_GAMES][2];
        for (int i = 0; i < Engine.NUMBER_GAMES; ++i) {
            int randomNum = Utils.randomNum();
            data[i][0] = "Question: " + randomNum;
            data[i][1] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.start(RULES_GAME, data);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
