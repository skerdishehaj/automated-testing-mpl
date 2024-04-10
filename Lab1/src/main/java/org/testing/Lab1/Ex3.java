package org.testing.Lab1;
/*
Declare two variables of String type and next please declare the boolean variable,
which will store the result of checking if two previously declared String values are equal
(Hint: use equals() method from String class). Display boolean value on the standard output (screen).*/

public class Ex3 {
  public static void main (String[] args) {
    String s1 = "skerdi";
    String s2 = "Skerdi";
    boolean areStringsEqual = s1.equals(s2);
    System.out.printf("Are %s and %s equal? -> %s", s1, s2, areStringsEqual);
  }
}
