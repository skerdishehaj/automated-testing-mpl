package org.testing.Lab1;

import org.w3c.dom.ls.LSOutput;

public class StringConcat {
  public static void main (String[] args) {
    String s1 = "s1 | ";
    String s2 = "s2 | ";
    String s3 = "s3 | ";
    String s4 = s1.concat(s2).concat(s3);
    System.out.println("Concat: " + s4);
    s4 = s1 +s2 + s3;
    System.out.println("Using + operator: " + s4);
  }

}
