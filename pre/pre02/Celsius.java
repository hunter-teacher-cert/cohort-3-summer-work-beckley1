import java.io.*;
import java.util.*;

public class Celsius{

  // Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".

  public static void main(String[] args){

    
    Scanner in = new Scanner(System.in); //starts scanner
    System.out.print("Please enter your temperature in Celsius as a decimal in order to convert to Fahrenheit: ");//prompts for input
    double c = in.nextDouble(); //accepts input
    in.nextLine();
    double f = (c * (9.0/5.0)) + 32;
    System.out.printf("%.1f degrees Celsius converts to %.1f degrees Fahrenheit\n", c, f);  
    in.nextLine();
    
  }
}