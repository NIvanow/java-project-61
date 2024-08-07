package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String RULES_GAME = "What number is missing in the progression?";
    static final int STEP_INTERVAL = 5;
    private static String[][] data = new String[Engine.NUMBER_GAMES][2];

    public static void game() {
        for (int i = 0; i < Engine.NUMBER_GAMES; ++i) {
            String[] numbers = randomProgression();
            int position = (int) (Math.random() * (double) numbers.length);
            String requiredNumber = numbers[position];
            numbers[position] = "..";
            data[i][0] = "Question: " + String.join(" ", numbers);
            data[i][1] = requiredNumber;
        }
        Engine.start(RULES_GAME, data);
    }

    public static String[] randomProgression() {
        String[] numbers = new String[Utils.randomNum(STEP_INTERVAL) + STEP_INTERVAL];
        int randomFirsNumber = Utils.randomNum(20);
        int randomStep = Utils.randomNum(20);
        numbers[0] = Integer.toString(randomFirsNumber);

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = Integer.toString(Integer.parseInt(numbers[i - 1]) + randomStep);
        }
        return numbers;
    }
}
