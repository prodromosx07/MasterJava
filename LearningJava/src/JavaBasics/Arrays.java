package JavaBasics;

import java.util.Scanner;

public class Arrays {

    //race cars timers
    public static void arraysExample1(){
        System.out.println("Number of laps: ");
        Scanner lapTimeInput = new Scanner(System.in);
        int numberOfLaps = lapTimeInput.nextInt();

        double[] lapTimes = new double[numberOfLaps];

        for (int i =0; i < numberOfLaps; i++){
            System.out.println("Lap Time: ");
            lapTimes[i] = lapTimeInput.nextDouble();
        }

        double fastestTime = lapTimes[0];
        for (int i = 0; i < lapTimes.length; i++){
            if(lapTimes[i] < fastestTime){
                fastestTime = lapTimes[i];
            }
        }
        System.out.println("Fastest Time: " + fastestTime);
    }

    //for each loop example
    public static void arraysExample2(){
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for(String planet : planets){
            System.out.println(planet);
        }
    }

    public static void arrayExercise1(){
        String[] places = {"Athens", "New York", "Los Angeles", "Oslo", "Helsinki"};
    }

    public static void arrayExercise2(){
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void arrayExercise3(){
        double[] d = {100.5, 49.2, 51.3, 110.5, 53.8};
        double sum = 0, total = 0;

        for (int i = 0; i < d.length; i++){
            sum += i;
            System.out.println(i);
        }

        System.out.println(total = sum / d.length);
    }

    public static void arrayExercise4(){
        Scanner askUser = new Scanner(System.in);
        String usersFavouriteFood[] = new String[3];

        System.out.println("Tell your 5 favourite foods\n");
        for (int i = 0; i < usersFavouriteFood.length; i++){
            usersFavouriteFood[i] = askUser.nextLine();
        }

        System.out.println("Your favourite foods are: ");
        for (int i = 0; i < usersFavouriteFood.length; i++){
            System.out.println(" - " + usersFavouriteFood[i]);
        }
    }
}
