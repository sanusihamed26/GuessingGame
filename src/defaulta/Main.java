package defaulta;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random()); // the guessed number.
        int trial = 5; //numbers of trials
        int i;
        // iterate
        for (i = 0; i < trial; i++) {

            System.out.println("Guess a number: ");
            int guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("wow!! you guessed rigth!! ");
                break;
            } else if (number < guess && i != trial - 1) {
                System.out.println("The number is " + "less than " + guess);

            } else if (number > guess && i != trial - 1) {
                System.out.println("The number is " + "greater than " + guess);

            }


        }
        if (i == trial) {
            System.out.println(
                    "You have exhausted the numbers of trials.");

            System.out.println(
                    "The number was " + number);
        }


    }





}
