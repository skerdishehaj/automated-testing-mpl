package org.testing.Lab1;

/**
 *     Declare an integer variable and assign any value to it. ​
 *
 * Next check, if the value of this variable is greater, or less, or equal to zero. ​
 *
 * In every case, please display the proper information on the screen. ​
 *
 * Please use conditional statement construction.
 */

public class Ex5 {
  public static void main (String[] args) {
    int intVal = 45;
    compareWith0(intVal);
  }
public static void compareWith0 (int val) {
    if(val < 0) {
      System.out.printf("Value %d is LESS than 0.",val);
    } else if (val == 0) {
      System.out.printf("Value %d is EQUAL than 0.", val);
    } else {
      System.out.printf("Value %d is GREATER than 0.", val);

    }
}

}
