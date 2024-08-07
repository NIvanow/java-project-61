package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final String RULES_GAME = "What is the result of the expression?";
    static final char[] OPERATIONS = new char[] {'+', '*', '-'};
    private static String[][] data = new String[Engine.NUMBER_GAMES][2];

    public static void game() {
        for (int i = 0; i < Engine.NUMBER_GAMES; ++i) {
            int randomNum1 = Utils.randomNum(20);
            int randomNum2 = Utils.randomNum(20);
            int randomOperation = Utils.randomNum(3);
            char operation = OPERATIONS[randomOperation];
            data[i][0] = "Question: " + randomNum1 + " " + operation + " " + randomNum2;
            data[i][1] = Integer.toString(calculate(randomNum1, randomNum2, operation));
        }
        Engine.start(RULES_GAME, data);
    }

    public static int calculate(int num1, int num2, char operation) {
        return switch (operation) {
            case '*' -> num1 * num2;
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            default -> 0;
        };
    }
}
