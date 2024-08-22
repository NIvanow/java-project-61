package hexlet.code;


import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.print("You choice: ");
        Scanner choiceStr = new Scanner(System.in);
        String choice = choiceStr.next();

        switch (choice) {
            case "0" -> {
            }
            case "1" -> Cli.greet();
            case "2" -> Even.game();
            case "3" -> Calc.game();
            case "4" -> GCD.game();
            case "5" -> Progression.game();
            case "6" -> Prime.game();
            default -> System.out.println("You entered an incorrect number!");
        }
    }
}


