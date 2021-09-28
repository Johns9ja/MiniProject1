/*
Mini Project 1
Group #3_: Jacob Johnson, Spencer Green, Joshua White, Alex Haban, McKenzie Peters
Date: 9/29/2021
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

  System.out.println("Welcome to the guessing game!"); //Print welcome message
  System.out.println("Please enter any positive whole number:"); //Prompt for number

  Scanner s = new Scanner(System.in); //Create Scanner object
  int userNum; //Create variable to store number entered by user
  userNum = s.nextInt(); //User enters number

  Random r = new Random(); //Create Random object
  int randomNum = r.nextInt(userNum); //Define Random number variable
  System.out.println("A random number has been generated"); //Print out that random number is generated

  playGame(randomNum, userNum); //Path to playGame method
  }

  static void playGame(int randNum, int numEntered) {

  System.out.println("Please guess a number between 0 and " + numEntered); //Prompt User for 1st Guess

  Scanner n = new Scanner(System.in); //Create new scanner object for guess
  int userGuess; //Create variable to store number guessed by user
  userGuess = n.nextInt(); //User guesses number

  int numTries; //Create variable to store number of guesses by user
  numTries = 1; //Define numTries variable

  while(userGuess != randNum){ //While loop for guessing game
      numTries++; //Adds 1 to numTries variable each time through loop


    if(userGuess < randNum) { //if User Guess is less than the random number generated
    System.out.println("Guess higher!"); //Print line
    
    System.out.println("Enter your new guess: "); //Prompt user for new guess
    userGuess = n.nextInt(); //Enter guess

  }
  
    else if(userGuess > randNum){ //If User Guess is greater than the Random Number generated
    System.out.println("Guess lower!"); //Print line
    
    System.out.println("Enter your new guess: "); //Prompt user for new guess
    userGuess = n.nextInt(); //Enter guess

  }
  }

    if(userGuess == randNum){ //if User Guess equals the Random Number generated
    System.out.println("Great, you win! It took you " + numTries + " tries."); //Print that user wins and the number of tries 
  }
  }
}
