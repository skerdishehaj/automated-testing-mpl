package org.testing.Lab1.Ex9;

/**
 * Implement a class named Rectangle, which has two integer fields: a, b (the side lengths of the rectangle). ​
 * Please, add a constructor, which will set values of all fields. ​
 * Add to class definition also the method named getArea(),
 * which returns the area of the rectangle and getPerimeter() returning figure perimeter. ​
 * For the created class definition add a test class with main() method,
 * where you have to create an instance of type Rectangle using two-arguments constructor,
 * then call getArea() and getPerimeter() methods and display returned values on the standard output.
 */
public class Ex9 {
  public static void main(String[] args) {
  Rectangle rect = new Rectangle(5, 6);
    System.out.printf("Surface of rect is: %d\n", rect.getArea());
    System.out.printf("Perimeter of rect is: %d\n", rect.getPerimeter());
  }
}
