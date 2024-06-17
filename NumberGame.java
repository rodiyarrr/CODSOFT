import java.util.*;
import java.util.Random;


public class NumberGame {
    public static void main(String[] args) {
        Random rand=new Random();

        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your guess: ");
        int score=0;
        int round=1;
        int attempts=10;

        while(true){
            int randomint=rand.nextInt(100);
            System.out.println("Round Number : "+round);
            while(attempts>0){
                System.out.println("Enter Your Guess: ");
                int guess=sc.nextInt();
                if(guess==randomint){
                    System.out.println("You Got It!");
                    score+=1;
                    System.out.println("Your Score = "+score);
                    System.out.println();
                    System.out.println("Press 1 to Play Again");
                    System.out.println("Press Any Other Key to Exit");
                    int choice=sc.nextInt();
                    if(choice==1){
                        round+=1;
                        attempts=10;
                        break;
                    }
                    else{
                        System.out.println("Thanks For Playing!");
                        break;
                    }
                }
                else if(guess<randomint){
                    System.out.println("Too Low");
                }
                else if(guess>randomint){
                    System.out.println("Too High");
                }
                attempts--;
                System.out.println("Attempts Left - "+attempts);
                System.out.println();

            }
            if (attempts==0) {
                System.out.println("Better Luck Next Time");
                System.out.println("Your Score - "+score);
                break;
            }
            else if (attempts<10) {
                break;
            }


        }

    }
}