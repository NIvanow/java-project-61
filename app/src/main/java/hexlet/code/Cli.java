package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner name = new Scanner(System.in);
        String userName = name.next();
        System.out.println("Hello, " + userName + "!");

    }
}
