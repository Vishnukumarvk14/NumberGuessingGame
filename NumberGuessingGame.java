package org.example;

import java.util.*;

public class NumberGuessingGame {
    static List<Integer> scores = new ArrayList<>();

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.displayMainMenu(scores);
    }

    public void displayMainMenu(List<Integer> scores) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("1) Start Game");
        System.out.println("2) View Scoreboard");
        System.out.println("3) Exit");
        System.out.println("--------------------");
        try {
            System.out.print("Choose an option: ");
            int menuOption = inputScanner.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.print("\nSet the range for the numbers: ");
                    int numberRange = inputScanner.nextInt();
                    int targetNum = generateRandomNumber(numberRange);
                    startGame(targetNum);
                    break;
                case 2:
                    displayScoreboard();
                    break;
                case 3:
                    System.out.println("\nThank you for playing!");
                    System.exit(0);
                    break;
                default:
                    throw new InputMismatchException("Invalid input. Please select a valid option.");
            }
        } catch (InputMismatchException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            displayMainMenu(scores);
        }
    }

    public int generateRandomNumber(int range) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(range) + 1;
    }

    public void startGame(int targetNum) {
        Scanner inputScanner = new Scanner(System.in);
        int attemptCount = 0;
        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            userGuess = inputScanner.nextInt();
            attemptCount++;
            if (userGuess > targetNum) {
                System.out.println("Too high, try again.");
            } else if (userGuess < targetNum) {
                System.out.println("Too low, try again.");
            }
        } while (userGuess != targetNum);

        System.out.println("\nCongratulations! You guessed the correct number in " + attemptCount + " attempts.");
        scores.add(attemptCount);
        displayMainMenu(scores);
    }

    public void displayScoreboard() {
        System.out.println("--------------------");
        System.out.println("Scoreboard");
        System.out.println("--------------------");
        System.out.println("Your best performance today:");
        Collections.sort(scores);
        for (Integer score : scores) {
            System.out.println("Completed the game in " + score + " attempts.");
        }
        System.out.println(" ");
        displayMainMenu(scores);
    }
}
