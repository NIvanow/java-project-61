package hexlet.code;


import hexlet.code.game.Greet;
import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    private static String choice;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. \n1 - Greet\n2 - Even"
                + "\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("You choice: ");
        Scanner choiceStr = new Scanner(System.in);
        choice = choiceStr.next();

        switch (choice) {
            case "0":
                break;
            case "1":
                Greet.greeting();
                break;
            case "2":
                Even.game();
                break;
            case "3":
                Calc.game();
                break;
            case "4":
                GCD.game();
                break;
            case "5":
                Progression.game();
                break;
            case "6":
                Prime.game();
                break;
            default:
                System.out.println("You entered an incorrect number!");
        }
    }
}


