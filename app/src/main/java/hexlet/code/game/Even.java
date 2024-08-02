package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int NUMBER_RANGE = 20;
    private static String[][] data = new String[3][2];

    public Even() {
    }

    public static void game() {
        Engine.start(RULES_GAME);

        for (int i = 0; i < 3; ++i) {
            int randomNum = (int) (Math.random() * NUMBER_RANGE);
            data[i][0] = question(randomNum);
            data[i][1] = isEven(randomNum);
        }

        Engine.resultGame(data);
    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static String question(int number) {
        return "Question: " + number;
    }
}
