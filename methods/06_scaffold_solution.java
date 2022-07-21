//PROVIDE :: start with basic java code and simple for loop already printed.

import java.io.*;
import java.util.*;

// ### Scaffold 
// Low: They can be given a skelton of a for loop where they have to plug in the variable for i
// Middle: Given a skelton with less input  where they have to create the for loop.
// High: They create their own for loop using their own code. Use blank replit file.

// #### Differentiation:

// Be given cheat sheet which tells them important detail like what is an int and a help example of the idea of a for loop. Trace Diagram of a simple for loop.

public class LiveCoding {

  public static void main(String[] args){
    // VERSION 1 (Low) :: Review loops from previous lesson
    // STUDENT-PROMPT :: Looking at this, What do you think the output will be?
    // for(int counter = 0; counter < 5; counter++){ 
    //   System.out.println("Java is fun");
    // }

    // VERSION 2 (Medium):: replace the hard coded five with the numberOfTimes variable.
    int numberOfTimes = 5;
    
    for(int counter = 0; counter < numberOfTimes; counter++){ 
      System.out.println("Java is fun");
    }
    //MUST-ANSWER-Q :: do you think version 1 and 2 will have the same result?

    //STUDENT-PROMPT :: How will the output change if we update numberOfTimes to 7?
    //BEEG REVEAL :: the condition is a for loop can use a variable that can update throughout the program.

    // Version 3 (High):: Add a scanner in to prompt the user for a number
    // PROVIDE :: Scanner input code
    System.out.println("How many times do you want to print!");
    Scanner in = new Scanner(System.in);
    numberOfTimes = in.nextInt();
    
    for(int counter = 0; counter < numberOfTimes; counter++){ 
        System.out.println("Java is fun");
    }

    //STUDENT-PROMPT :: While running, ask the students what number will numberOfTimes hold?

    //DELIBERATE-ERROR :: Students usually choose increasingly big numbers, we could but a number bigger than max int number, larger than 2,147,483,647, try 3 billion
      
  }
}