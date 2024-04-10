package org.example;

public class Generator {
  public static int generate(int absValue) {
    int negVal = -absValue;
    int range = absValue - negVal + 1;
    return (int) (Math.random() * range) + negVal;
  }
}
