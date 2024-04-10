package org.testing.Lab1.Ex10;

import java.util.Arrays;

public class Company {
  private String companyName;
  private Employee[] employees;
  public Company(String companyName) {
    this.companyName = companyName;
  }
  public Company(){}

  public float getAverageAge() {
    int totalAge = 0;
    for (Employee emp1 : this.employees) {
      totalAge += emp1.getAge();
    }
    return (float) totalAge / this.employees.length;
  }


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Employee[] getEmployees() {
    return employees;
  }

  public void setEmployees(Employee[] employees) {
    this.employees = employees;
  }

  @Override
  public String toString() {
    return "Company{" +
        "companyName='" + companyName + '\'' +
        ", employees=" + Arrays.toString(employees) +
        '}';
  }
}
