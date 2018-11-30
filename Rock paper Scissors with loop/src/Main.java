
import java.util.Scanner;
import java.util.Random;


    public class Main {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            //ask whether user wants to start game
            System.out.println("press 1 to begin");
            System.out.println("press 2 to end game");
            String play = input.nextLine();
            boolean inGame = play.equals("1");

            int comScore = 0;
            int userScore = 0;
            int gamePenalty=0;// every time user types in something invalid


            while (inGame) {

                int rock = 0;
                int paper = 1;
                int scissors = 2;
                int p; //player//
                int c; //computer//



                Scanner myScan = new Scanner(System.in);
                Random myRand = new Random();

                System.out.println("Choose");
                System.out.println("0=rock");
                System.out.println("1=paper");
                System.out.println("2=scissors");
                p = myScan.nextInt();
                c = myRand.nextInt(2);


                System.out.println("Your score:" + userScore + " - computer:" + comScore);

                if (p == c) {//if the player and computer choose the same number//
                    System.out.println("It's a tie!");

                } else if ((p == rock && c == scissors) || (p == scissors && c == paper) || (p == paper && c == rock)) {
                    System.out.println("Player wins! :) ");
                    userScore++;

                } else if ((c == rock && p == scissors) || (c == scissors && p == paper) || (c == paper && p == rock)) {
                    System.out.println("Computer Wins! :(");
                    comScore++;


                } else System.out.println("Invalid selection.Play again");
                gamePenalty++;
            }

            if (gamePenalty==3) {
                System.out.println("Sorry, you have selected too much invalid answers. Try again next time ");
            //break;
            }

            else
            if (play.equals("2")){
                System.out.println("Thanks for playing");
                System.out.println("Total user score : "+ userScore);
                System.out.println("Total computer score : "+ comScore);
                System.out.println("Total game penalty : "+gamePenalty);
                System.out.println("***********************************************");



            }
        }
    }

