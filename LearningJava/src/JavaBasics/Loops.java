package JavaBasics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {

    public static void forLoopExercise1(){
        for (int i = 1; i <= 40; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Quack");
            }
        }
    }

    public static void forLoopExercise2()
    {
        do {
            System.out.println("Password: ");
            Scanner userInputPassword = new Scanner(System.in);
            String userInputtedPassword = userInputPassword.next();

            if (userInputtedPassword .equals("shark50")){
                System.out.println("ACCESS APPROVED");
                break;
            }else {
                System.out.println("Enter your password again");
            }
        }while (true);
    }

    public static void forLoopExercise3(){
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
    }

    public static void forLoopExercise4(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        System.out.println("Pick a number\n");
        Scanner pickNumber = new Scanner(System.in);
        int userPickedNumber = pickNumber.nextInt();

        if(userPickedNumber > randomNumber){
            System.out.println("Lower");
        } else {
            System.out.println("Higher");
        }
    }

    public static void forLoopExercise5(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int userPickedNumber = 0;
        int attemptedGuesses = 0;

        do
        {
            System.out.println("Pick a number\n");
            Scanner pickNumber = new Scanner(System.in);
            int userPickedNumberr = pickNumber.nextInt();
            userPickedNumber = userPickedNumberr;

            if(userPickedNumber < randomNumber){
                System.out.println("Higher");
                attemptedGuesses = attemptedGuesses + 1;
            } else {
                System.out.println("Lower");
                attemptedGuesses = attemptedGuesses + 1;
            }
        }while (randomNumber != userPickedNumber);
        System.out.println("You needed " + attemptedGuesses + " tries");
    }
}
