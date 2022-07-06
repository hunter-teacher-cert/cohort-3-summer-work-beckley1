import java.io.*;
import java.util.*;
import java.util.Random;

//Here's what this should resemble when finished:
// I'm thinking of a number between 1 and 100
// (including both). Can you guess what it is?
// Type a number: 45
// Your guess is: 45
// The number I was thinking of is: 14
// You were off by: 31


public class Guess{

public static void main(String[] args){
  System.out.println("I'm thinking of a number between 1 and   100 (including both). Can you guess what it is?");
  
  System.out.print("Type a number: ");//prompts user for int
  Scanner in = new Scanner(System.in);
  int guess = in.nextInt(); //turns user input into 'guess'
  in.nextLine();
  System.out.println("You guessed " + guess + ".");
        // computer picks a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of was " + number + ".");
        System.out.println("You were off by " + (Math.abs(guess - number))+ ".");
  
}
  
}