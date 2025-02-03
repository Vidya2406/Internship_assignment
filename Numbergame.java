import java.util.Scanner;

public class Numbergame {

    public static void guessingnumbergame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int trials = 5;
        int i, guess;
        System.out.println("Choose a number from 1 to 100. Try to guess the number in five trials");

        for (i = 0; i < trials; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congrats you've correctly guessed the number!!!");
                break;
            }

            else if (number > guess && i != trials - 1) {
                System.out.println("The number is greater than " + guess);
            }

            else if (number < guess && i != trials - 1) {
                System.out.println("The number is less than " + guess);
            }

            if (i == trials) {
                System.out.println("You have completed your all the trials.Thank you...");
                System.out.println("The number was:" + number);
            }

        }
    }

    public static void main(String[] args) {
        guessingnumbergame();
        System.out.println("We are done with the execution of the program...");
    }
}
