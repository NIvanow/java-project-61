package hexlet.code.game;

import hexlet.code.Engine;

public class Calc {
    static final String RULES_GAME = "What is the result of the expression?";
    static final int OPERATION_RANGE = 3;
    static final int NUMBER_RANGE = 20;
    static final char[] OPERATIONS = new char[]{'+', '*', '-'};
    private static String[][] data = new String[3][2];
    static final int NUMBER_GAMES = 3;
    public Calc() {
    }

    public static void game() {
        Engine.start(RULES_GAME);

        for (int i = 0; i < NUMBER_GAMES; ++i) {
            int randomNum1 = (int) (Math.random() * NUMBER_RANGE);
            int randomNum2 = (int) (Math.random() * NUMBER_RANGE);
            int randomOperation = (int) (Math.random() * OPERATION_RANGE);
            char operation = OPERATIONS[randomOperation];
            data[i][0] = question(randomNum1, randomNum2, operation);
            data[i][1] = calculate(randomNum1, randomNum2, operation);
        }

        Engine.resultGame(data);
    }

    public static String question(int num1, int num2, char operation) {
        return "Question: " + num1 + " " + operation + " " + num2;
    }

    public static String calculate(int num1, int num2, char operation) {
        switch (operation) {
            case '*':
                return Integer.toString(num1 * num2);
            case '+':
                return Integer.toString(num1 + num2);
            case ',':
            default:
                return "Error data";
            case '-':
                return Integer.toString(num1 - num2);
        }
    }
}
