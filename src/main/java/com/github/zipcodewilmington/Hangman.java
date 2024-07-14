package com.github.zipcodewilmington;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public static void main(String[] args) {

        int amountOfTries = 11;
        String[] listOfWords = {"bear", "hare", "lion", "rats"};
        String theWord = listOfWords[chooseRandomWord()];
        String guess = "____";

        while (amountOfTries >= 1){
            if (guess.equals(theWord)){
                System.out.println("you win sweaty");
                break;
            }
            if (amountOfTries == 11){
                System.out.println("Let's play hangman v0.01");
                amountOfTries--;
            }
            else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("You have " + amountOfTries + "tries remaining.");
                System.out.println("Enter a single character:");
                char characterGuess = scanner.next().charAt(0);
                if(isMatchOrNah(theWord, characterGuess)) {
                    int indexOfCorrectGuess = checkWhereValueIsTrue(theWord, characterGuess);
                    System.out.println("You got a correct guess!");
                    // _ _ a _
                    guess = toStringPrintOut(guess, theWord, indexOfCorrectGuess);
                    System.out.println(guess);
                    amountOfTries--;
                } else {
                    System.out.println("You got guessed wrong!");
                    amountOfTries--;
                }
            }
        }
    }

    public static boolean isMatchOrNah(String theword, char character) {
        char[] ch = theword.toCharArray();
        for (int i = 0; i < ch.length;i++){
            if (character ==(ch[i])){
                return true;
            }
        }
        return false;
    }

    public static Integer checkWhereValueIsTrue(String theword, char character){
        char[] ch = theword.toCharArray();
        Integer index = null;
        for (int i = 0; i < ch.length;i++){
            if (character ==(ch[i])){
                index = i;
            }
        }
        return index;
    }

    public static int chooseRandomWord(){

        Random random = new Random();
        return random.nextInt(4);
    }

    public static String toStringPrintOut (String guess, String theWord, int indexOfCurrentGuess){
        String[] splitGuesses = guess.split("");
        splitGuesses[indexOfCurrentGuess] = Character.toString(theWord.charAt(indexOfCurrentGuess));

        StringBuilder builder = new StringBuilder(splitGuesses.length);
        for (String element : splitGuesses){
            builder.append(element);
        }
        return builder.toString();
    }
}