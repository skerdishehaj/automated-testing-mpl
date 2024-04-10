package org.testing.Lab1;

public class Calculator {
  public static void main (String[] args) {
    int a = 5;
    int b = 2;
    int c = 3;
    int result1 = a - b - c;
    System.out.printf("%d * %d / %d = %d",a, b, c, result1);

    long d = 100l, e = 101l, f = 102l;
    long result2 = d * e / f;

    System.out.printf("%d * %d / %d = %d",d, e, f, result2);
  }
}
