package com.github.zipcodewilmington;


import javax.print.attribute.standard.MediaSize;
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


//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Let's Play HangMan v0.01");
//        System.out.println("Current Guesses: "+amountOfTries);
//        System.out.println("Enter a single character");
//        String character = scanner.nextLine();
//

        while (amountOfTries >= 1){
            if (amountOfTries == 11){
                System.out.println("Let's play hangman v0.01");
                amountOfTries--;
            }
            else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("You have " + amountOfTries + "tries remaining.");
                System.out.println("Enter a single character:");
                char character = scanner.next().charAt(0);
                isMatchOrNah(theWord, character);
                System.out.println(isMatchOrNah(theWord,character));
                boolean wasItTrue = isMatchOrNah(theWord,character);
                checkWhereValueIsTrue(wasItTrue);


            }
        }
    }
//    public static char[] turnIntoChar(String theword){
//
//        return ch;
//    }

    public static boolean isMatchOrNah(String theword, char character) {
        char [] ch = theword.toCharArray();
        for (int i = 0; i < ch.length;i++){
        if (character ==(ch[i])){
            for (int i = 0; i < ch.length;++){
                if (ch[i].charAt[i] == character;){
//need to figure out how to compare the character at ch[index] with the character typed
                }
            }
        }
        }return false;
    }





    public static int checkWhereValueIsTrue(boolean wasItTrue){


        } else return 0;
    }


    public static int chooseRandomWord(){

        Random random = new Random();
        return random.nextInt(3);}

}
