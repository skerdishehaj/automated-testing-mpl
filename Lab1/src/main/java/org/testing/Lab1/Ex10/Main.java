package org.testing.Lab1.Ex10;

/**
 * Implement a class named Employee, which consists of three fields:
 * firstName, lastName and age.
 * Add a three-argument constructor, which allows initializing field values and getter for age field.
 *
 * In the next step, please create class named Company, which consists of the fields:
 * name of String type - company name
 * employees, which is a 5-element table of Employee type (Employee[]) - table will store all company employees
 * <p>
 * In class Company, please also add one-argument constructor, which takes name parameter as an argument,
 * create setEmployees() method definition for setting company employees.
 * Implement toString() methods for every class (Employee and Company,
 * use Alt+Insert -> toString in IntelliJ), which will be returning whole object data.​
 * <p>
 * Implement also getAverageAge(), which returns the average age of company employees.
 * <p>
 * In the last step, please create a test class named CompanyTest.
 * In the main() method, create 5 instances of Employee type,
 * which will be a representation of 5 employees working in the company.
 * Then add them to the table and create an instance of type Company using one-argument constructor. ​
 * <p>
 * Set employees field values using previously created setter.
 * Next, please display all company data on the standard output (hint: toString() methods will be helpful) and average age computed by calling getAverageAge() method on Company type instance.
 */
public class Main {
  public static void main (String[] args) {
    Employee em1 = new Employee("A", "F", 10);
    Employee em2 = new Employee("B", "G", 11);
    Employee em3 = new Employee("C", "H", 12);
    Employee em4 = new Employee("D", "J", 13);
    Employee em5 = new Employee("E", "K", 14);
    Employee[] employees = new Employee[] {em1, em2, em3, em4, em5};
    Company c = new Company("Skerdi");
    c.setEmployees(employees);
    System.out.println(c.getAverageAge());
    System.out.println(c);
  }
}
