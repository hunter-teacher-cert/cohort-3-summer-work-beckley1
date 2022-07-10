import java.io.*;
import java.util.*;

public class Methods{

  // This is the method for Exercise 2 in Think Java Chapter 6
  public static boolean isDivisible(int n, int m){

    if (n % m == 0){
      return true;
    }
    else{
      return false;
    }
  }

  //This is the method for Ex. 3 in Think Java Chapter 6
  public static boolean isTriangle(int a, int b, int c){

    if ((a + b < c) || (b + c < a) || (a + c < b)){
      return false;
    }
    else{
      return true;
    }
    
  }

  //This is the method for Ex. 8 in Think Java Chapter 6
  public static int ack(int m, int n){
    
    if (m==0){
      return n+1;
    }
    else if ((m>0)&&(n==0)){
      return ack(m-1, 1);
    }
    else if ((m>0)&&(n>0)){
      return ack(m-1, ack(m, n-1));
    }
    else {
      return 0;
    }
    
  }

  
  public static void main(String[] args){
    System.out.println(isDivisible(12,3));
    System.out.println(isTriangle(1,3,4));
    System.out.println(ack(3,4));
  }
}