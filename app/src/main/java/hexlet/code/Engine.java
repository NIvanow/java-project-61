package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_GAMES = 3;

    public static void start(String str, String[][] dataGame) {
        String userName;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        userName = name.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(str);

        for (int i = 0; i < NUMBER_GAMES; ++i) {
            System.out.println(dataGame[i][0]);
            System.out.print("Your answer: ");
            Scanner choiceEven = new Scanner(System.in);
            String choiceEvenStr = choiceEven.next();
            if (!dataGame[i][1].equals(choiceEvenStr)) {
                System.out.println("'" + choiceEvenStr + "' is wrong answer ;(. Correct answer was '"
                        + dataGame[i][1] + "'\nLet's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");

    }
}
