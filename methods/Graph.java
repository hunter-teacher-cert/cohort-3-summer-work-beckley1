import java.util.*;
import java.io.*;

public class Graph{

  public static void barGraphify(int[]nums){
    for(int i = 0; i<nums.length; i++){
      if(nums[i] == 0){
        System.out.println(i + ": " + "");
      }
      else if(nums[i] == 1){
        System.out.println(i + ": "+ "=");
      }
      else if(nums[i] == 2){
        System.out.println(i+ ": " + "==");
      }
      else {
        System.out.println(i + ": " + "===");
      
      }
      }
  }
  public static void main (String[]args){
    int[] a = new int[]{0,1,2,3};
    int[] b = new int[]{1,0,3,2};
    barGraphify(a);
    System.out.println();
    System.out.println("Here's scrambled!\n");
    barGraphify(b);
  }
  
}
  
