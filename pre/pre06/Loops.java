import java.io.*;
import java.util.*;

public class Loops{

  //exercise 2 Chap. 7 Square root
/*Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess using this formula:

x1 =(x0 + a/x0) / 2    */

  
   public static double squareRoot(double a){
      double oldVal = a/2;
      double newVal = a/2;
      double interval = 0;
      do{
         oldVal = newVal;
         newVal = (oldVal + a/oldVal)/2;
         interval = Math.abs(newVal - oldVal);
         System.out.println(newVal);
      }while(interval > 0.0001);
      return newVal;
   }
   

  //exercise 3 Chap. 7
  // In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation.

public static double power(int x, int n)
{
    int total = 1;
    for(int i = 0; i < n; i++) // i can be declared here directly
    {   
        total = (x * total);
    }
    return total; // total remains 1 if n = 0   
}


  



  // //exercise 4 Chap. 7
  // public static double factorial(){

    
  
  public static void main(String[] args){
    squareRoot(16);
    System.out.println("Exercise 4 Chap 7 power" + ": " + power(2,3));
}
}