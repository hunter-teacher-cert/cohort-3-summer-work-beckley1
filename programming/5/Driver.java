import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * Ben Eckley
 * collaborators: Michael Randazzo, Maxwell Yearwood, Qianhui Vanessa Zou
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;

	//assign var the address of a newly-apportioned Time object
	t = new Time(2, 38, 20);
  System.out.println(t.toString());
  System.out.println(t);
  String temp = t+"!"; 
  System.out.println(temp);    
  // t.set(2,42, 57);
  // System.out.println(t); 
  Time ot1 = new Time(2, 38 ,10);
  
  //t.add(ot);
  System.out.println(t.compareTo(ot1));    
      
      
    }//end main()

}//end class