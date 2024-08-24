# Number Guessing Game 🎮

## Overview
This project is a simple console-based Number Guessing Game developed in Java. The game challenges the player to guess a randomly generated number within a user-defined range. Players receive feedback on whether their guess is too high or too low until they correctly guess the number. The game tracks the player's performance by recording the number of attempts taken, which can be viewed in the scoreboard.

## Features
- **Start Game**: Allows the user to start a new game, set the range for the random number, and begin guessing.
- **View Scoreboard**: Displays the player's performance by showing the fewest number of attempts taken to guess correctly across all games played.
- **Exit**: Allows the user to exit the game.

## How to Run
1. Ensure that Java is installed on your machine.
2. Compile the Java file using the following command:
   ```bash
   javac NumberGuessingGame.java
   
## Project Structure
- **NumberGuessingGame**: The main class that handles the core functionality of the game, including:
  - **`startMenu(List<Integer> scoreList)`**: Displays the main menu and handles user input for starting a game, viewing the scoreboard, or exiting.
  - **`generateRandomNumber(int range)`**: Generates a random number within the specified range.
  - **`playGame(int targetNumber)`**: Manages the gameplay by accepting user guesses and providing feedback on whether the guess is too high or too low.
  - **`showScoreboard()`**: Displays the sorted list of scores showing the number of attempts taken to guess correctly.

## Notes
- This application is designed for educational purposes and is a basic implementation of a number guessing game.
- The score data is stored in memory and will be lost when the program exits.

## Contribution
- Feel free to modify, enhance, or extend the functionality of the game. Contributions are welcome!
