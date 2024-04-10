package org.testing.Lab1;

/**
 * Implement the program displaying all the numbers from the
 * range 1 - 100 which are divisible by 5 beginning from 100 (in reverse order).
 */
public class Ex7 {
  public static void main (String[] args) {
    printDivisibleByReversed(1, 104, 5);
  }
  public static void printDivisibleByReversed(int startVal, int endVal, int pjestuesi) {
    while (endVal >= startVal) {
      if(endVal % pjestuesi == 0) {
        System.out.println(endVal);
        endVal -= pjestuesi;
      } else {
        endVal--;
      }
    }
  }
}

