import java.util.Scanner;

public class Number_Guessing_Game {

    public static void guessingNumberGame() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" <------ Number Guessing Game ------>");
        System.out.println();
        System.out.println();
        int K = 5;
        int round = 3;

        int i, guess;
        int win = 0;
        System.out.println("<- You have 3 rounds to win the game (Best of 3) ->");
        System.out.println();
        for (int j = 0; j < round; j++) {
            System.out.println(" <===== " + "Round " + (j + 1) + " =====> ");
            System.out.println();

            int number = 1 + (int) (100 * Math.random());

            System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

            for (i = 0; i < K; i++) {

                System.out.println("Guess " + (i + 1) + " the number:");
                guess = sc.nextInt();

                if (number == guess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    win++;
                    break;
                } else if (number > guess && i != K - 1) {
                    System.out.println("The number is " + "greater than " + guess);
                } else if (number < guess && i != K - 1) {
                    System.out.println("The number is" + " less than " + guess);
                }
                System.out.println();
            }
            if (i == K) {
                System.out.println("You have exhausted" + " K trials.");

                System.out.println("The number was " + number);
            }
            System.out.println();
        }
        if (win >= 2)
            System.out.println("<============= You Win ===========>");
        else
            System.out.println("<============= You Lose ===========>");
    }

    public static void main(String arg[]) {

        guessingNumberGame();
    }
}
