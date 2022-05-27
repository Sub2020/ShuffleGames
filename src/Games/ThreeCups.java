package Games;

import java.util.Random;
import java.util.Scanner;

public class ThreeCups {

    private static Random scanner;

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("------------------------------welcome to shuffle game--------------------------------");
        String ballOne = "1 won";
        System.out.println("                          Lets play a Shuffle Cup games. \nI have 3 blue cups and one red ball. I will hide the ball inside one of the cups and shuffle all cups.");
        System.out.println("                                   Guess, which cup has the ball?\n");
        System.out.println("   ###          ###          ### \n  #####        #####        ##### \n #######      #######      #######\n    1            2            3 \n");
        System.out.println("Your answer:");
        int guess = scan.nextInt();
        playTheGame(guess);

    }
    static void playTheGame(int guess) {
        Random random = new Random();
        int number = 1+ random.nextInt(3);
        String ballOne = "   WIN          ###          ### \n   WIN         #####        ##### \n   WIN        #######      #######\n    1            2            3 ";
        String ballTwo = "   ###          WIN          ### \n  #####         WIN         ##### \n #######        WIN        #######\n    1            2            3 ";
        String ballThree = "   ###          ###          WIN \n  #####        #####         WIN  \n #######      #######        WIN  \n    1            2            3 ";
        if (number ==guess) {
            if (number == 1) {
                System.out.println(ballOne + "\n Good answer!");
            }
            if (number == 2) {
                System.out.println(ballTwo + "\n Good answer!");
            }
            if (number == 3) {
                System.out.println(ballThree + "\n Good answer!");
            }
        }
        if(number!= guess){
            if (number == 1) {
                System.out.println("Unfortunately, bad answer. \nThe correct answer is:");

                System.out.println(ballOne);
            }
            else if (number == 2) {
                System.out.println("Unfortunately, bad answer. \nThe correct answer is:");
                System.out.println(ballTwo);
            }
            else if (number == 3) {
                System.out.println("Unfortunately, bad answer. \nThe correct answer is:");
                System.out.println(ballThree);
                //System.out.println("Do you want to play again? click 'A' play again, 'B' exit");
                System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");

                guess = scanner.nextInt();
                while (guess != 1 && guess != 2){
                    System.out.println("invalid entry please enter 1 or 2");
                    guess = scanner.nextInt();
                }
            }
        }
    }
}
