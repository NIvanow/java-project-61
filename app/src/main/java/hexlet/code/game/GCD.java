package hexlet.code.game;

import hexlet.code.Engine;

public class GCD {
    static final String RULES_GAME = "Find the greatest common divisor of given numbers.";
    static final int NUMBER_RANGE = 20;
    static final int NUMBER_GAMES = 3;
    private static String[][] data = new String[3][2];

    public GCD() {
    }

    public static void game() {
        Engine.start(RULES_GAME);

        for (int i = 0; i < NUMBER_GAMES; ++i) {
            int randomNum1 = (int) (Math.random() * NUMBER_RANGE);
            int randomNum2 = (int) (Math.random() * NUMBER_RANGE);
            data[i][0] = question(randomNum1, randomNum2);
            data[i][1] = logicGCD(randomNum1, randomNum2);
        }

        Engine.resultGame(data);
    }

    public static String question(int num1, int num2) {
        return "Question: " + num1 + " " + num2;
    }

    public static String logicGCD(int num1, int num2) {
        String result = "1";
        int maxNum = Math.max(num1, num2);
        int maxResult = 1;

        for (int i = maxNum; i > 1; --i) {
            if (num1 % i == 0 && num2 % i == 0 && maxResult < i) {
                result = Integer.toString(i);
                maxResult = i;
            }
        }

        return result;
    }
}
