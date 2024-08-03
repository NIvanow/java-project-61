package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    static final String RULES_GAME = "What number is missing in the progression?";
    static final int STEP_INTERVAL = 5;
    static final int NUMBER_RANGE = 20;
    static final int NUMBER_GAMES = 3;
    static final int DATA_NUMBER = 2;
    private static String[][] data = new String[NUMBER_GAMES][DATA_NUMBER];

    public Progression() {
    }

    public static void game() {
        Engine.start(RULES_GAME);

        for (int i = 0; i < NUMBER_GAMES; ++i) {
            String[] numbers = randomProgression();
            int position = (int) (Math.random() * (double) numbers.length);
            String requiredNumber = numbers[position];
            numbers[position] = "..";
            data[i][0] = question(numbers);
            data[i][1] = requiredNumber;
        }

        Engine.resultGame(data);
    }

    public static String question(String[] numbers) {
        return "Question: " + String.join(" ", numbers);
    }

    public static String[] randomProgression() {
        String[] numbers = new String[(int) (Math.random() * STEP_INTERVAL + STEP_INTERVAL)];
        int randomFirsNumber = (int) (Math.random() * NUMBER_RANGE);
        int randomStep = (int) (Math.random() * NUMBER_RANGE);
        numbers[0] = Integer.toString(randomFirsNumber);

        for (int j = 1; j < numbers.length; ++j) {
            numbers[j] = Integer.toString(Integer.parseInt(numbers[j - 1]) + randomStep);
        }

        return numbers;
    }
}
