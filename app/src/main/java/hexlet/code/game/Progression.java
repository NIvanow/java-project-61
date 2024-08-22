package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String RULES_GAME = "What number is missing in the progression?";
    static final int STEP_INTERVAL = 5;

    public static void game() {
        String[][] data = new String[Engine.NUMBER_GAMES][2];
        for (int i = 0; i < Engine.NUMBER_GAMES; ++i) {
            int lengthProgression = Utils.randomNum(STEP_INTERVAL) + STEP_INTERVAL;
            int randomStep = Utils.randomNum();
            int position = (int) (Math.random() * lengthProgression);
            int randomFirsNumber = Utils.randomNum();

            String[] numbers = randomProgression(lengthProgression, randomStep, randomFirsNumber);
            String requiredNumber = numbers[position];
            numbers[position] = "..";
            data[i][0] = "Question: " + String.join(" ", numbers);
            data[i][1] = requiredNumber;
        }
        Engine.start(RULES_GAME, data);
    }

    private static String[] randomProgression(int length, int step, int first) {
        String[] numbers = new String[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = String.valueOf(first + i * step);
        }

        return numbers;
    }
}
