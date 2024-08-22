package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final String RULES_GAME = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] data = new String[Engine.NUMBER_GAMES][2];
        for (int i = 0; i < Engine.NUMBER_GAMES; ++i) {
            int randomNum1 = Utils.randomNum();
            int randomNum2 = Utils.randomNum();
            data[i][0] = "Question: " + randomNum1 + " " + randomNum2;
            data[i][1] = Integer.toString(logicGCD(randomNum1, randomNum2));
        }
        Engine.start(RULES_GAME, data);
    }

    private static int logicGCD(int num1, int num2) {
        if (num1 == num2 && num1 == 0) {
            return 0;
        }
        int result = 1;
        int maxNum = Math.max(num1, num2);
        int maxResult = 1;

        for (int i = maxNum; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0 && maxResult < i) {
                result = i;
                maxResult = i;
            }
        }
        return result;
    }
}
