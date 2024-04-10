package org.testing.Lab1;

/**
 * Declare an integer variable and assign any value to this variable. ​
 *
 * Then using a conditional statement check if it is an even number. ​
 *
 * If yes, please display proper information on the screen.
 */

public class Ex4 {
  public static void main (String[] args) {
    int intVal = 10;
    if(intVal % 2 == 0) {
      System.out.printf("Number %d is even.", intVal);
    }else {
      System.out.printf("Number %d is odd", intVal);
    }
  }
}
