package com.laptop.stuff;

import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, String[]> eightBallAnswers = new Answers().getEightBallAnswers();
    public static void main(String[] args) {
	// write your code here
        play();
    }

    private static void play() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            displayInstructions();
            String value = scanner.nextLine();
            quit = determineQuit(value);
            if(!quit){
                getAnswer();
            } else {
                farewell();
            }
        }
        scanner.close();
    }

    private static void farewell() {
        System.out.println("Bye");
    }

    private static void displayInstructions() {
        System.out.println("Ask Magic 8-Ball a question and press enter");
        System.out.println("Enter \"Quit\" to quit");
    }

    private static void getAnswer() {
        int number = (int) ((Math.random() * eightBallAnswers.size()) + 1);
        eightBallSays();
        tabSpace();
        for(String word : eightBallAnswers.get(number)){
            System.out.print(word + " ");
        }
        displayBlankLine();
        displayBlankLine();
    }

    private static void tabSpace() {
        System.out.print("\t");
    }

    private static void eightBallSays() {
        System.out.println("Magic 8-Ball Says: ");
    }

    private static boolean determineQuit(String value) {
        return value.toUpperCase().equals("QUIT");
    }

    private static void displayBlankLine(){
        System.out.println();
    }


}
