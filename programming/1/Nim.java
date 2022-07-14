import java.io.*;
import java.util.*;

/* 
  GOAL: Be the player to remove the last stone.
  RULES:
  - bag contains 12 stones initially
  - a move consists of removing 1-3 stones from the bag
  CODE:
  - turn starts with prompting user for num of stones to remove
  - tell user how many AI removed (random 1-3)
  - continue until there is a winner
*/

public class Nim
  {
    public static void main (String[] args)
    {
      //Welcome message
      System.out.println("Welcome to the Wonderful Game of Nim!");
      //make starting bag of stones with 12 stones
      int stones = 12;
      int stonesTaken;
      Scanner input = new Scanner(System.in);//creates scanner which will accept user input
      
      // Round begins reading # of stones in the bag
      System.out.printf("There are %d stones in the bag.\n", stones); // printf formats using special markup and parameters in what the console prints   
      //prompt player to pick up a stone(s)
      //loop until game ends
      while (stones > 0){
        //prompt user input
        System.out.println (" Remove 1 to 3 stones from the bag please: ");
      stonesTaken = input.nextInt();
      stones = stones - stonesTaken;
      System.out.printf("There are %d stones left in the bag.\n", stones);
         //check win
      if(stones <= 0)
      {
        System.out.println("You are the hero of the galaxy!");
        break; //force out loop
      }
      else{
       //machine turn
      System.out.println("Tis the robot's turn:");
      stonesTaken = (int) (Math.random()*3)+1;//random # generator
      //Math.random()(min(0) - max(2) +1) +min this calculates range, keeps in mind the zero index
      System.out.println("The metal idiot took " + stonesTaken);
      //calculate number of stones remaining, print
      stones = stones - stonesTaken;
      System.out.println("There are " + stones + " left");
      }
      if(stones <= 0)
      {
        System.out.println("The Souless AI Wins!");
        break; //force out loop
      }
      else
      {continue;
      }  
      }
       System.out.println("The game has ended");
    }
  }
  