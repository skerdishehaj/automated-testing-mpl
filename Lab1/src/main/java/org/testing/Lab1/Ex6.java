package org.testing.Lab1;

/**
 *     Implement the program displaying all the numbers from the range 5 – 100​
 *
 *  (use ‘for’ loop).​
 *
 *     Implement the same program, but using a ‘while’ loop.
 */
public class Ex6 {
  public static void main (String[] args) {
    displayNumberFromTo(5, 100);
  }
  public static void displayNumberFromTo (int startVal, int endVal) {
    System.out.printf("Printing numbers from %d to %d...\n", startVal, endVal);
    while(startVal <= endVal) {
      System.out.println(startVal);
      startVal++;
    }
  }
}
