package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int QUANTITY_ATTEMPTS = 3;
    private static String userName;

    public Engine() {
    }

    public static void start(String str) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        userName = name.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(str);
    }

    public static void resultGame(String[][] dataGame) {
        int count = 0;

        for (int i = 0; i < 3; ++i) {
            System.out.println(dataGame[i][0]);
            System.out.print("Your answer: ");
            Scanner choiceEven = new Scanner(System.in);
            String choiceEvenStr = choiceEven.next();
            if (!dataGame[i][1].equals(choiceEvenStr)) {
                System.out.println("'" + choiceEvenStr + "' is wrong answer ;(. Correct answer was '"
                        + dataGame[i][1] + "'\nLet's try again, " + userName + "!");
                break;
            }

            System.out.println("Correct!");
            ++count;
        }

        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

    public static void questionForUser(String[][] dataGame) {
    }
}
