package JavaBasics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JavaFundamentalsExercises {
    //Exercise 1
    public static void schoolGradeCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum possible score for this exam: ");
        int maxScore = scanner.nextInt();

        System.out.print("How many students took the exam: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        System.out.println("\nEnter each student's score.");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Composition.Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        System.out.println("\n--- Statistics ---");

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            double studentScore = scores[i];
            double studentPercentage = ((double) scores[i] / maxScore) * 100;
            System.out.println("Composition.Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
            sum += studentScore;
        }

        double mean = (double) sum / scores.length;
        double meanPercentage = (mean / maxScore) * 100;
        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");
    }

    //Exercise 2
    public static void trueOrFalseQuestions() {
        Scanner userInput = new Scanner(System.in);

        String[] questions = {"A computer needs power to work. True or false?",
                "Apple is not a fruit. True or false?",
                "The earth is flat. True or false?",
                "Being in a relationship is overrated and expensive. True or false?",
                "Free video games for everyone? True or false?"};

        boolean[] questionAnswers = {true, false, false, true, true};
        boolean[] userAnswers = new boolean[questions.length];
        int finalScore = 0;

        //assign
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            userAnswers[i] = userInput.nextBoolean();
        }

        for (int i = 0; i < questions.length; i++){
            if(userAnswers[i] == questionAnswers[i]){
                System.out.println("Question " + i + " is correct");
                finalScore++;
            }
            else{
                System.out.println("Question " + i + " is wrong");
            }
        }
        System.out.println("Your final score is: " + finalScore);
    }

    //exercise 3
    public static void GuessTheNumberGame() {
        System.out.println("\nGuess My Number Game \n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;

        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("\nI guess " + randomNumber + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;
            } else if (input.equals("lower")) {
                max = randomNumber - 1;
            } else if (input.equals("correct")) {
                System.out.println("\n" + randomNumber + ", eh? I knew I'd get it eventually.");
                break;
            }

            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
            }
        }
    }

    //exercise 3
    public static void GuessTheNumberGameOptimized() {
        System.out.println("\nGuess My Number Game \n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = 50;

        while (true) {
            System.out.println("\nI guess " + guess + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            } else if (input.equals("correct")) {
                System.out.println("\n" + guess + ", eh? I knew I'd get it eventually.");
                break;
            }

            guess = (min + max) /2;

            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
}

