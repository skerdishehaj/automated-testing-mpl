package org.lab2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    public CalculatorTest() {
    }

    @BeforeEach
    public void init() {
        System.out.println("Executing method init");
        this.calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Executing tearDown");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Executing beforeAll method");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Executing afterAll method");
    }

    @Test
    public void sumTest() {
        System.out.println("Executing method sumTest");
        int td1 = 2;
        int td2 = 3;
        int expectedResult = 5;
        int actualResult = this.calculator.sum(td1, td2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumTest1() {
        System.out.println("Executing msumTest1");
        int td1 = 0;
        int td2 = 7;
        int expectedResult = 7;
        int actualResult = this.calculator.sum(td1, td2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Disabled
    public void sumTest2() {
        System.out.println("Executing sumTest2");
        Calculator calculator = new Calculator();
        int td1 = 10;
        int td2 = -20;
        int expectedResult = -10;
        int actualResult = calculator.sum(td1, td2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void zbritjaTest() {
        int td3 = 4;
        int td4 = 3;
        int expectedResult = 1;
        int actualResult = this.calculator.zbritje(td3, td4);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divisionTest() {
        int td5 = 10;
        int td6 = 5;
        int expectedResult = 2;
        double actualResult = this.calculator.division(td5, td6);
        Assertions.assertEquals((double)expectedResult, actualResult);
    }
}
