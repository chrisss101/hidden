import setup.hiddenWord;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        hiddenWord trial = new hiddenWord("MANGO");
        String hint = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Give me your guess");
        String guess = in.nextLine();
        hint = trial.getHint(guess);
        while(!hint.equals("MANGO")) {
            System.out.println("Your Hint:" + hint);
            System.out.println("What is your next guess?");
            guess = in.nextLine();
            hint = trial.getHint(guess);
        }
        System.out.println("You got it");
    }
}
