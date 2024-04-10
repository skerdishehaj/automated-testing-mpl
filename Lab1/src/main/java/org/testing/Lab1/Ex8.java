package org.testing.Lab1;

import java.util.Scanner;

/**
 *     Implement the program, where you have to read 6 integers (using Scanner class) and save them in the
 *     previously declared 6-element table. ​
 *
 *     Then compute an arithmetic average for all table values and display the result on the standard output.
 */
public class Ex8 {
  public static void main (String[] args) {
    int[] inputtedNumbers = new int[6];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
      System.out.printf("Input the %d number:", (i + 1));
      inputtedNumbers[i] = scanner.nextInt();
    }
  }
}
